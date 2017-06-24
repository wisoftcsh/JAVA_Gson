package tutorial;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by choiseonho on 2017. 6. 13..
 */
public class JsonMain {
  private static AtomicLong ID = new AtomicLong();

  public static void main(String[] args) {
    Account account = new Account(ID.incrementAndGet(), "csh", new AccountName("seonho", "choi"));
    final String result = convertBeansToJson(account);
    System.out.println(result);

    final Long testId = ID.incrementAndGet();
    final String username = "test";
    final AccountName accountName = new AccountName("test", "testing");
    final Map<String, Object> map = new HashMap<>();
    map.put("id", testId);
    map.put("username", username);
    map.put("accountName", accountName);
    final String result2 = mapConvertBeansToJson(map);
    System.out.println(result2);
  }

  private static String convertBeansToJson(final Account account) {
    return new Gson().toJson(account);
  }

  private static String mapConvertBeansToJson(final Map<String, Object> map) {
    return new Gson().toJson(map);
  }
}
