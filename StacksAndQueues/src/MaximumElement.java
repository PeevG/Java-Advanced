import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            if (command.contains("1 ")) {
                String[] data = command.split(" ");
                int numbersToPush = Integer.parseInt(data[1]);
                stack.push(numbersToPush);
            } else if (command.equals("2")) {
                stack.poll();
            } else if (command.equals("3")) {
                System.out.println(Collections.max(stack));
            }
        }
    }
}
