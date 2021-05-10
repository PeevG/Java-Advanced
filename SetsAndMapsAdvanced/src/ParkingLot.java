import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> carNumbers = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split(", ");
            String direction = tokens[0];
            String carNumber = tokens[1];
            if (direction.equals("IN")) {
                carNumbers.add(carNumber);
            } else {
                carNumbers.remove(carNumber);
            }
            input = scanner.nextLine();
        }
        String output = carNumbers.stream()
                .collect(Collectors.joining(System.lineSeparator()));
        System.out.println(output);

        if (carNumbers.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }
    }
}
