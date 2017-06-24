package tutorial;

/**
 * Created by choiseonho on 2017. 6. 13..
 */
public class AccountName {
  private String first;
  private String last;

  public AccountName(String first, String last) {
    this.first = first;
    this.last = last;
  }

  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  @Override
  public String toString(){
    final StringBuffer sb = new StringBuffer();
    sb.append("{first=").append(first).append(", last=").append(last).append("}");
    return sb.toString();
  }
}
