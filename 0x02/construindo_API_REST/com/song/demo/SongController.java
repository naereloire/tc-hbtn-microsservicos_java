package com.song.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {

  private final SongRepository songRepository;

  public SongController(SongRepository songRepository) {
    this.songRepository = songRepository;
  }

  @GetMapping("/welcome")
  @Autowired
  private String mensagemBoasVindas() {
    return "Bem vindo!";
  }

  @ResponseBody
  @GetMapping(path = "/allSongs")
  public List<Song> getAllSongs() {
    return null;
  }

  @GetMapping(path = "/findSong/{id}")
  public Song findSongById(@PathVariable Integer id) {
    return songRepository.getSongById(id);
  }

  @PostMapping(path = "/addSong", consumes = "application/json", produces = "application/json")
  public Song addSong(@RequestBody Song song) {
    songRepository.addSong(song);
    return song;
  }

  @PutMapping(path = "/updateSong", consumes = "application/json", produces = "application/json")
  public Song updadeSong(@RequestBody Song song) {
    songRepository.updateSong(song);
    return song;
  }

  @DeleteMapping(path = "/removeSong", consumes = "application/json", produces = "application/json")
  public void deleteSongById(@RequestBody Song song) {
    songRepository.removeSong(song);
  }
}
