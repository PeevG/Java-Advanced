import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] elements = scanner.nextLine().split("\\s+");
            for (String element : elements) {
                set.add(element);
            }
        }
        set
                .forEach(e -> {
                    System.out.print(e + " ");
                });
    }
}
