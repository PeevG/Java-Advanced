import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();

        String currentURL = null;

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (stack.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    currentURL = stack.pop();
                }
            } else {
                if (currentURL != null) {
                    stack.push(currentURL);
                }
                currentURL = input;
            }
            System.out.println(currentURL);
            input = scanner.nextLine();
        }
    }
}
