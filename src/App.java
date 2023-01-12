import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) throws Exception {
    List<String> array1 = new ArrayList<>();
    List<String> array2 = new ArrayList<>();

    array1.add("Morango");
    array1.add("Uva");
    array1.add("Acerola");
    array1.add("Manga");

    array2.add("Uva");
    array2.add("Caju");
    array2.add("Morango");
    array2.add("Kiwi");

    List<String> array3 = new ArrayList<>();

    for (int i = 0; i < array1.size(); i++) {
      if (array2.contains(array1.get(i))) {
        array3.add(array1.get(i));
      }
    }

    System.out.println(array3);
  }
}
