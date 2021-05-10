import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            symbols.putIfAbsent(currentChar, 0);
            symbols.put(currentChar, symbols.get(currentChar) + 1);
        }

        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
