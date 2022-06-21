package com.song.demo;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Song {
  private Integer id;
  private String nome;
  private String artista;
  private String album;
  private String anoLancamento;
}
