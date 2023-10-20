package bootcamp.desafio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_card")
public class Card {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false)
  private String number;

  @Column( name = "available_limit", precision = 18, scale = 2, nullable = false)
  private BigDecimal limit;


  public Card() {
  }


  public Card(Long id, String number, BigDecimal limit) {
    this.id = id;
    this.number = number;
    this.limit = limit;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumber() {
    return this.number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public BigDecimal getLimit() {
    return this.limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }
}
