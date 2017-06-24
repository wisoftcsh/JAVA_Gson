package quiz;

/**
 * Created by choiseonho on 2017. 6. 13..
 */
public class Account {
  private Long id;
  private String username;
  private AccountName name;

  public Account(Long id, String username, AccountName name) {
    this.id = id;
    this.username = username;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AccountName getName() {
    return name;
  }

  public void setName(AccountName name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "[id : " + id + ", username : " + username + ", accountName : " + name + "]";
  }
}
