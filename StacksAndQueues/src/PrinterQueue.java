import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> filesToBePrinted = new ArrayDeque<>();

        while (!input.equals("print")) {

            if (input.equals("cancel")) {

                String fileName = filesToBePrinted.poll();
                if (fileName != null) {
                    System.out.println("Canceled " + fileName);
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {
                filesToBePrinted.offer(input);
            }
            input = scanner.nextLine();
        }
        for (String files : filesToBePrinted) {
            System.out.println(files);
        }
    }
}
