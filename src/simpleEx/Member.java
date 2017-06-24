package simpleEx;

import java.util.List;
import java.util.Map;

/**
 * Created by choiseonho on 2017. 6. 13..
 */
public class Member {
  private String username;
  private String message;
  private List<String> hobby;
  private Map<String, String> contacts;

  public Member(){}
  public Member(String username, String message) {
    this.username = username;
    this.message = message;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public List<String> getHobby() {
    return hobby;
  }

  public void setHobby(List<String> hobby) {
    this.hobby = hobby;
  }

  public Map<String, String> getContacts() {
    return contacts;
  }

  public void setContacts(Map<String, String> contacts) {
    this.contacts = contacts;
  }

  @Override
  public String toString() {
    return "simpleEx.Member{" +
        "username='" + username + '\'' +
        ", message='" + message + '\'' +
        ", hobby=" + hobby +
        ", contacts=" + contacts +
        '}';
  }
}
