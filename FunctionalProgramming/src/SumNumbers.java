import java.util.Arrays;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Count = " + numbers.length);
        System.out.println("Sum = " + sum);

    }
}
