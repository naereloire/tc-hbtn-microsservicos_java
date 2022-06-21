package com.song.demo;

import lombok.*;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@AllArgsConstructor
//@NoArgsConstructor
public class Song {
  private Integer id;
  private String nome;
  private String artista;
  private String album;
  private String anoLancamento;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getArtista() {
    return artista;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public String getAnoLancamento() {
    return anoLancamento;
  }

  public void setAnoLancamento(String anoLancamento) {
    this.anoLancamento = anoLancamento;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Song)) return false;

    Song song = (Song) o;

    if (!getId().equals(song.getId())) return false;
    if (!getNome().equals(song.getNome())) return false;
    if (!getArtista().equals(song.getArtista())) return false;
    if (!getAlbum().equals(song.getAlbum())) return false;
    if (!getAnoLancamento().equals(song.getAnoLancamento())) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = getId().hashCode();
    result = 31 * result + getNome().hashCode();
    result = 31 * result + getArtista().hashCode();
    result = 31 * result + getAlbum().hashCode();
    result = 31 * result + getAnoLancamento().hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Song{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", artista='" + artista + '\'' +
            ", album='" + album + '\'' +
            ", anoLancamento='" + anoLancamento + '\'' +
            '}';
  }
}
