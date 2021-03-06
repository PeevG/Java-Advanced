import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        while (n-- > 0){

            String[] input = scanner.nextLine().split("\\s+");
            String brand = input[0];
            String model  = input[1];
            int horsePower = Integer.parseInt(input[2]);

            Car car = new Car(brand, model, horsePower);
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.printf("The car is: %s %s - %d HP.%n", car.getBrand(), car.getModel(), car.getHorsePower());
        }
    }
}
