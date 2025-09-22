import java.util.*;

public class WorkingWithJavaCollectionsFramework {

 public static void main(String[] args) {
  System.out.println("Hello World!");
  List<String> words = new ArrayList<>(List.of("RemoveMe", "RemoveFirstCharacter", "IgnoreMe"));
  System.out.println("Original List:" + words);
  ListIterator<String> iterator = words.listIterator();
  while (iterator.hasNext()) {
   String word = iterator.next();
   if (word.equals("RemoveMe")) {
    iterator.remove();
   } else if (word.equals("RemoveFirstCharacter") && word.length() > 0) {
    iterator.set(word.substring(1));
   }
  }
  System.out.println("Updated list: " + words);
 }
}
