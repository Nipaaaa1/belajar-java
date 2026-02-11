import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    // 39 - hashmap

    HashMap<String, Integer> map = new HashMap<>();

    map.put("Udin", 17);
    map.put("Wahyu", 18);
    map.put("Jamal", 20);

    System.out.println(map);

    // Map on loop
    for (String key : map.keySet()) {
      System.out.printf("[%s:%d]\n", key, map.get(key));
    }

  }
}
