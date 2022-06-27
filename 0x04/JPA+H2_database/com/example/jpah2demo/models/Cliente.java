package com.example.jpah2demo.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cliente")
@Entity
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "nome", nullable = false)
  private String nome;

  @Column(name = "idade", nullable = false)
  private Integer idade;

  @Column(name = "email", nullable = false)
  private String email;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "telefone_id", referencedColumnName = "id")
  @ToString.Exclude
  private List<Telefone> telefoneList;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "endereco_id", referencedColumnName = "id")
  @ToString.Exclude
  private List<Endereco> enderecoList;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Cliente cliente = (Cliente) o;
    return id != null && Objects.equals(id, cliente.id);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
