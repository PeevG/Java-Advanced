import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvenOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bounds = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int firstBound = bounds[0];
        int lastBound = bounds[1];

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = n -> n % 2 != 0;

        String condition = scanner.nextLine();
        for (int i = firstBound; i <= lastBound; i++) {
            switch (condition) {
                case "odd":
                    if (isOdd.test(i)) {
                        System.out.print(i + " ");
                    }
                    break;
                case "even":
                    if (isEven.test(i)) {
                        System.out.print(i + " ");
                    }
                    break;

            }

        }

        System.out.println();
    }
}
