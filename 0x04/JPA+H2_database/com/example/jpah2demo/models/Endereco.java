package com.example.jpah2demo.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Endereco {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "logradouro", nullable = false)
  private String logradouro;

  @Column(name = "endereco", nullable = false)
  private String endereco;

  @Column(name = "numero", nullable = false)
  private String numero;

  @Column(name = "bairro", nullable = false)
  private String bairro;

  @Column(name = "cidade", nullable = false)
  private String cidade;

  @Column(name = "estado", nullable = false)
  private String estado;

  @Column(name = "cep", nullable = false)
  private Integer cep;
}
