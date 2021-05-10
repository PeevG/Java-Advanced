import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .filter(n -> isEven(n))
                .toArray();
        System.out.println(formatArray(numbers));

        Arrays.sort(numbers);

        System.out.println(formatArray(numbers));

    }

    public static String formatArray(int[] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }


}
