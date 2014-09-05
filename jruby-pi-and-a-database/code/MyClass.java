import java.util.*;

public class MyClass {

  private Map<String, String> map;

  public MyClass() {
    this.map = new HashMap<String, String>();
  }

  public Map<String, String> getMap() {
    return map;
  }

  public void printMap() {
    Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<String, String> entry = iter.next();
      System.out.println("Key class" + entry.getKey().getClass());
      System.out.println("Value class" + entry.getValue().getClass());
    }
  }

}
