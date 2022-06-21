package com.song.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
  private final List<Song> list = new ArrayList<>();

  public List<Song> getAllSongs() {
    return list;
  }

  public Song getSongById(Integer id) {
    return list.stream().filter(song -> song.getId().equals(id)).findAny().orElse(null);
  }

  public void addSong(Song s) {
    // TODO
  }

  public void updateSong(Song s) {
    // TODO
  }

  public void removeSong(Song s) {
    // TODO
  }
}
