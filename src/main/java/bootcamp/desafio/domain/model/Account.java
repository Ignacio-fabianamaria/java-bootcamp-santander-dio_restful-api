package bootcamp.desafio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_account")
public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false)
  private String number;

  @Column(nullable = false)
  private String agency;

  @Column(precision = 18, scale = 2, nullable = false)
  private BigDecimal balance;
  @Column(name = "additional_limit",precision = 18, scale = 2, nullable = false)
  private BigDecimal limit;

  public Account(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {
    this.id = id;
    this.number = number;
    this.agency = agency;
    this.balance = balance;
    this.limit = limit;
  }
  public Account() {
    // Construtor padrão vazio
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

  public String getAgency() {
    return this.agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  public BigDecimal getBalance() {
    return this.balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public BigDecimal getLimit() {
    return this.limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

}
