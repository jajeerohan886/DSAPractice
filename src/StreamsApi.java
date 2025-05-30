import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsApi {

    public static void main(String[] args) {

        // filter out even numbers and print the odd numbers.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddList = numbers.stream().filter(i->(i%2==1)).toList();
        for(int i : oddList) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------");

        // Sum of All Numbers
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().mapToInt(i->i).sum();
        System.out.println("sum - " + sum);
        System.out.println("-------------------------------------------------------------------");

        // Maximum Number
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max = numbers.stream().mapToInt(i->i).max().getAsInt();
        System.out.println("max - " + max);
        System.out.println("-------------------------------------------------------------------");

        // Count Words Starting with 'A'
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Peach", "Apricot", "Berry");
        List<String> startsWithA = words.stream().filter(i->i.startsWith("A")).toList();
        for(String i : startsWithA) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------");

        // Average of Even Numbers
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double avgOfEvenNumbers = numbers.stream().filter(i->i%2==0).mapToInt(i->i).average().getAsDouble();
        System.out.println("avgOfEvenNumbers - " + avgOfEvenNumbers);
        System.out.println("-------------------------------------------------------------------");

        // Strings to Uppercase
        words = Arrays.asList("java", "stream", "example");
        List<String> upperCase = words.stream().map(i->i.toUpperCase()).toList();
        for(String i : upperCase) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------");

        // remove duplicates and sort
        words = Arrays.asList("java", "stream", "example", "sorted", "java", "stream");
        List<String> nonDuplicatesAndSorted = words.stream().distinct().sorted().toList();
        for(String i : nonDuplicatesAndSorted) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------");

        // Stream code that groups a list of strings by their length.
        words = Arrays.asList("apple", "bat", "batman", "cherry", "dog", "elephant");
        Map<Integer, Long> map = words.stream().collect(Collectors.groupingBy(x->x.length(), Collectors.counting()));
        for(Map.Entry<Integer, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("-------------------------------------------------------------------");

        // concatenate them into a single string, with a space separating each word
        words = Arrays.asList("Hello", "World", "Java", "Stream");
        String joinedString = words.stream().collect(Collectors.joining(" "));
        System.out.println("joinedString - " + joinedString);
        System.out.println("-------------------------------------------------------------------");

        // First Element Matching a Predicate
        words = Arrays.asList("apple", "banana", "cherry", "date", "kiwi");
        String first = words.stream().filter(x->x.length()>5).findFirst().get();
        System.out.println("first - " + first);
        System.out.println("-------------------------------------------------------------------");

        // FlatMap Example
        List<List<String>> listOfLists = Arrays.asList(    Arrays.asList("apple", "banana"),    Arrays.asList("cherry", "date"),    Arrays.asList("kiwi", "lemon"));
        List<String> flatMap = listOfLists.stream().flatMap(x->x.stream()).toList();
        for(String i : flatMap) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------");

        // create a new list where each integer is doubled.
        numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> doubles = numbers.stream().map(x->x*2).toList();
        for(int i : doubles) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------");

        // find the first element that is divisible by 3.
        numbers = Arrays.asList(5, 7, 8, 9, 11, 12, 13);
        int divisibleBy3 = numbers.stream().filter(x->x%3==0).findFirst().get();
        System.out.println("divisibleBy3 - " + divisibleBy3);
        System.out.println("-------------------------------------------------------------------");

    }
}
