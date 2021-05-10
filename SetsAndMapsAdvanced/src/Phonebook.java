import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        Map<String, String> namesWithPhones = new LinkedHashMap<>();

        while (!(input = scanner.nextLine()).equals("search")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];
            namesWithPhones.putIfAbsent(name, number);

        }
        while (!(input = scanner.nextLine()).equals("stop")) {
            if (namesWithPhones.containsKey(input)) {
                System.out.print(String.format("%s -> %s%n", input, namesWithPhones.get(input)));
            } else {
                System.out.println("Contact " + input + " does not exist.");
            }
        }
    }
}
