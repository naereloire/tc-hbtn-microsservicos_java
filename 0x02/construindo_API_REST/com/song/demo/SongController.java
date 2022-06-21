package com.song.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class SongController {

  @GetMapping("/welcome")
  @Autowired
  private String mensagemBoasVindas() {
    return "Bem vindo %s!";
  }

  @ResponseBody
  @GetMapping(path = "/allSongs")
  public List<Song> getAllSongs() {
    Song song = new Song(1, "like a virgin", "Madonna", "Like a Virgin", "1984");
    return Arrays.asList(song, song, song);
  }

  @GetMapping(path = "/findSong/{id}")
  public Song findSongById(@PathVariable Integer id) {
    // TODO
    return null;
  }

  @PostMapping(path = "/addSong", consumes = "application/json", produces = "application/json")
  public Song addSong(@RequestBody Song song) {
    // TODO
    return song;
  }

  @PutMapping(path = "/updateSong", consumes = "application/json", produces = "application/json")
  public Song updadeSong(@RequestBody Song song) {
    // TODO
    return song;
  }

  @DeleteMapping(path = "/removeSong", consumes = "application/json", produces = "application/json")
  public void deleteSongById(@RequestBody Song song) {
    // TODO
  }
}
