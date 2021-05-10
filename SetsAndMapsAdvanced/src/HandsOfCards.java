import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Set<String>> playersWithDecks = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] tokens = input.split(": ");
            String name = tokens[0];
            String[] cards = tokens[1].split(", ");

            if (!playersWithDecks.containsKey(name)) {
                playersWithDecks.put(name, new HashSet<>());
            }
            for (String card : cards) {
                playersWithDecks.get(name).add(card);
            }
            input = scanner.nextLine();
        }
        String regex = "(?<power>[0-9]+|[JQKA])(?<multiplier>[SHDC]{1})";
        Pattern pattern = Pattern.compile(regex);

        for (Map.Entry<String, Set<String>> entry : playersWithDecks.entrySet()) {
            String name = entry.getKey();
            int playerScores = 0;

            for (String card : entry.getValue()) {
                Matcher matcher = pattern.matcher(card);

                if (matcher.find()) {
                    String power = matcher.group("power");
                    String type = matcher.group("multiplier");
                    int value = getValueByPower(power);
                    int multiplier = getMultiplierByType(type);
                    int scores = value * multiplier;
                    playerScores += scores;
                }
            }
            System.out.println(String.format("%s: %d", name, playerScores));
        }
    }

    private static int getMultiplierByType(String type) {
        int multiplier = 0;
        switch (type) {
            case "S":
                multiplier = 4;
                break;
            case "H":
                multiplier = 3;
                break;
            case "D":
                multiplier = 2;
                break;
            case "C":
                multiplier = 1;
                break;
        }
        return multiplier;
    }

    private static int getValueByPower(String power) {
        int value;
        switch (power) {
            case "J":
                value = 11;
                break;
            case "Q":
                value = 12;
                break;
            case "K":
                value = 13;
                break;
            case "A":
                value = 14;
                break;
            default:
                value = Integer.parseInt(power);
                break;
        }
        return value;
    }
}
