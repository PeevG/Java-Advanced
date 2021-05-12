package GenericsP07AndP08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //•	Add <element> - Adds the given element to the end of the list
        //•	Remove <index> - Removes the element at the given index
        //•	Contains <element> - Prints if the list contains the given element (true or false)
        //•	Swap <index> <index> - Swaps the elements at the given indexes
        //•	Greater <element> - Counts the elements that are greater than the given element and prints their count
        //•	Max - Prints the maximum element in the list
        //•	Min - Prints the minimum element in the list
        //•	Print
        CustomList<String> customList = new CustomList<>();
        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    String element = tokens[1];
                    customList.add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(tokens[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    element = tokens[1];
                    System.out.println(customList.contains(element));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);
                    customList.swap(firstIndex,secondIndex);
                    break;
                case "Greater":
                    element = tokens[1];
                    System.out.println(customList.countGreaterThan(element));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    System.out.println(customList);
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
