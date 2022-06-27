package com.example.jpah2demo;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Telefone {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "ddd", nullable = false)
  private String DDD;

  @Column(name = "numero", nullable = false)
  private String numero;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Telefone)) return false;

    Telefone telefone = (Telefone) o;

    if (!getId().equals(telefone.getId())) return false;
    if (!getDDD().equals(telefone.getDDD())) return false;
    return getNumero().equals(telefone.getNumero());
  }

  @Override
  public int hashCode() {
    int result = getId().hashCode();
    result = 31 * result + getDDD().hashCode();
    result = 31 * result + getNumero().hashCode();
    return result;
  }
}
