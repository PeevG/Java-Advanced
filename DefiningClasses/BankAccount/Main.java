import com.sun.source.tree.LineMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Integer, BankAccount> vault = new HashMap<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            switch (tokens[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    vault.put(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    if (!vault.containsKey(id)) {
                        System.out.println("Account does not exist");
                    } else {
                        double amount = Double.parseDouble(tokens[2]);
                        vault.get(id).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                    }
                    break;
                case "SetInterest":
                    double newInterest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(newInterest);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(tokens[1]);
                    if(vault.containsKey(id)) {
                            int years = Integer.parseInt(tokens[2]);
                            double interest = vault.get(id).getInterest(years);
                            System.out.printf("%.2f%n", interest);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }
            input = scanner.nextLine();
        }

    }
}
