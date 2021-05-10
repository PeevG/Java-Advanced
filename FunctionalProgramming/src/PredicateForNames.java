import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int namesLength = Integer.parseInt(scanner.nextLine());

        Predicate<String> lengthChecker = name -> name.length() <= namesLength;

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(lengthChecker)
                .forEach(name -> System.out.println(name));
    }
}
