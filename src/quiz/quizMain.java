package quiz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by choiseonho on 2017. 6. 13..
 */
public class quizMain {
  private static AtomicLong ID = new AtomicLong();

  public static void main(String[] args) {
    final List<Account> list = new ArrayList<>();
    final List<Account> list2 = new ArrayList<>();
    final List<Account> list3 = new ArrayList<>();
    final Map<String, List<Account>> map = new HashMap<>();
    Account account1 = new Account(ID.incrementAndGet(), "hyunju", new AccountName("Hyunju", "Park"));
    Account account2 = new Account(ID.incrementAndGet(), "msseo", new AccountName("Minseok", "Seo"));
    Account account3 = new Account(ID.incrementAndGet(), "msjeon", new AccountName("Seonsik", "Jeon"));
    Account account4 = new Account(ID.incrementAndGet(), "mskim", new AccountName("Youngdon", "Kim"));
    Account account5 = new Account(ID.incrementAndGet(), "kdh", new AccountName("Donghui", "Kim"));
    Account account6 = new Account(ID.incrementAndGet(), "ohs", new AccountName("HyungSeck", "Oh"));

    list.add(account1);
    list2.add(account2);
    list2.add(account3);
    list2.add(account4);
    list3.add(account5);
    list3.add(account6);

    map.put("professor", list);
    map.put("postdoc", list2);
    map.put("master", list3);

    final String result = mapConvertBeansToJson(map);
    System.out.println(result);
  }

  private static String mapConvertBeansToJson(final Map<String, List<Account>> map) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    return gson.toJson(map);
  }
}
