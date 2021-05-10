import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        Set<Integer> nSequence = new LinkedHashSet<>();
        Set<Integer> mSequence = new LinkedHashSet<>();


        for (int i = 0; i < n; i++) {
            nSequence.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < m; i++) {
            mSequence.add(Integer.parseInt(scanner.nextLine()));
        }

        nSequence
                .forEach(e -> {
                    if (mSequence.contains(e)) {
                        System.out.print(e + " ");
                    }
                });
    }
}
