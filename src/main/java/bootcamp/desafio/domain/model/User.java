package bootcamp.desafio.domain.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_name")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @OneToOne(cascade = CascadeType.ALL)
  private Account account;
  @OneToOne(cascade = CascadeType.ALL)
  private Card card;

  public User(Long id, String name, Account account, Card card) {
    this.id = id;
    this.name = name;
    this.account = account;
    this.card = card;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account getAccount() {
    return this.account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Card getCard() {
    return this.card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

}
