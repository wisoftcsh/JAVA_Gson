package simpleEx;

import com.google.gson.Gson;

/**
 * Created by choiseonho on 2017. 6. 13..
 */
public class ApplicationInitializer {
  private static String dummy = "{\n" +
      "  \"username\" : \"seonho\",\n" +
      "  \"message\" : \"Hello\",\n" +
      "  \"hobby\" : [\"Soccer\", \"Baseball\", \"Read Book\"],\n" +
      "  \"contacts\" : {\n" +
      "    \"address\" : \"Daejeon\",\n" +
      "    \"phone\" : \"10-1111-1111\"\n" +
      "  }\n" +
      "}";

  public static void main(String[] args) {
    serializationFromDummy();
    deserializationFromDummy();
  }

  private static void deserializationFromDummy() {
    Member member = new Gson().fromJson(dummy, Member.class); // 리플렉션
    System.out.println("deserialization : " + member);
  }

  private static void serializationFromDummy(){
    Member member = new Member();
    member.setUsername("simpleEx.Member");
    member.setMessage("Hello, simpleEx.Member!");

    String result = new Gson().toJson(member);
    System.out.println("serialization : " + result);
  }
}
