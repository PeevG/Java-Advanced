import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> map = new LinkedHashMap<>();

        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (double number : input) {
            map.putIfAbsent(number, 0);
            map.put(number, map.get(number) + 1);
        }
        map.forEach((k, v) -> {
            System.out.print(String.format("%.1f -> %d%n", k, v));
        });
    }
}
