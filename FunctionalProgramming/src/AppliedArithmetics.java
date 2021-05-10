import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = "";

        Function<int[], int[]> addOne = arr -> Arrays.stream(arr).map(num -> num += 1).toArray();

        Function<int[], int[]> multiplyByTwo = array -> Arrays.stream(array).map(n -> n *= 2).toArray();

        Function<int[], int[]> subtractOne = array -> Arrays.stream(array).map(n -> n -= 1).toArray();

        Consumer<int[]> printer = arr -> Arrays.stream(arr).forEach(e -> System.out.print(e + " "));


        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (!input.equals("end")) {
            switch (input) {
                case "add":
                    nums = addOne.apply(nums);
                    break;
                case "multiply":
                    nums = multiplyByTwo.apply(nums);
                    break;
                case "subtract":
                    nums = subtractOneMethod(nums);
                    break;
                case "print":
                    printer.accept(nums);
                    System.out.println();
                    break;
            }

            input = scanner.nextLine();
        }


    }

    public static int[] subtractOneMethod(int[] numbers) {
        return Arrays.stream(numbers).map(num -> num -= 1).toArray();
    }
}
