import java.util.function.Predicate;
import java.util.Collection;
import java.util.List;

public class WorkingWithGenerics {
 public static void main(String[] args) {
  // Odd number integers
  Collection<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
  int oddNumberCount = countIf(numbers, n -> n % 2 != 0);
  System.out.println("Total number of odd numbers: "+oddNumberCount);

  // Count prime numbers
  int primeNumbersCount = countIf(numbers, n -> WorkingWithGenerics.isPrime(n));
  System.out.println("Total number of prime numbers: "+primeNumbersCount);

  // Count palindromes
  Collection<String> words = List.of("kayak", "wow", "word", "insert", "noon", "civic", "level");

  int palindromeCount = countIf(words, WorkingWithGenerics::isPalindrome);
  System.out.println("Total number of palindromes: " + palindromeCount);
 }

 private static boolean isPalindrome(String element) {
  final String reversedWord = new StringBuilder(element).reverse().toString();
  return element.equals(reversedWord);
 }

 private static boolean isPrime(int element) {
  if (element <= 1 || (element % 2 == 0 && element > 2))
   return false;
  double s = Math.sqrt(element);
  for (int i = 3; i <= s; i++) {
   if (element % i == 0)
    return false;
  }
  return true;
 }

 public static <T> int countIf(Collection<T> collection, Predicate<T> condition) {
  int count = 0;
  for (T element : collection) {
   if (condition.test(element)) {
    count++;
   }
  }
  return count;
 }

}