import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Double>> shopProductPrice = new TreeMap<>();

        while (!input.equals("Revision")) {

            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);


            shopProductPrice.putIfAbsent(shop, new LinkedHashMap<>());
            shopProductPrice.get(shop).putIfAbsent(product, price);

            input = scanner.nextLine();
        }
        shopProductPrice
                .entrySet()
                .stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + "-> ");
                    entry.getValue()
                            .entrySet()
                            .stream()
                            .forEach(innerEntry -> {
                                System.out.printf("Product: %s, Price: %.1f%n"
                                        , innerEntry.getKey(),
                                        innerEntry.getValue());
                            });

                });
    }
}
