import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String name = "";
        String email = "";
        int count = 1;
        Map<String, String> namesAndEmails = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            if (count % 2 != 0) {
                name = input;
                namesAndEmails.putIfAbsent(input, "");
            } else {
                email = input;
                namesAndEmails.put(name, email);
            }
            count++;
            input = scanner.nextLine();
        }
        namesAndEmails.entrySet()
                .forEach(entry -> {
                    if (!entry.getValue().contains(".us")
                            && !entry.getValue().contains(".uk")
                            && !entry.getValue().contains(".com")) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }
                });
    }
}
