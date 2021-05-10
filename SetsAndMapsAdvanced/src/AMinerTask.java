import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> map = new LinkedHashMap<>();
        int count = 1;
        String resource = "";
        int quantity = 0;

        while (!input.equals("stop")) {

            if (count % 2 != 0) {
                resource = input;
                map.putIfAbsent(resource, 0);
            } else if (count % 2 == 0) {
                quantity = Integer.parseInt(input);
                map.put(resource, map.get(resource) + quantity);
            }
            count++;
            input = scanner.nextLine();
        }
        map.forEach((k, v) -> {
            System.out.println(String.format("%s -> %d", k, v));
        });
    }
}
