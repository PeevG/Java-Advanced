import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVat = num -> num * 1.2;

        double[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        System.out.println("Prices with VAT:");
        for (double number : numbers) {
            number = addVat.apply(number);
            System.out.print(String.format("%.2f%n", number));
        }

    }
}
