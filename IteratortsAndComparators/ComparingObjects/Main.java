package IteratorsAndComparators.ComparingObjects;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Person> personInfo = new ArrayList<>();
        String input;
        while (!"END".equals(input = scan.nextLine())) {
            String[] data = input.split("\\s+");
            String name = data[0];
            String town = data[2];
            int age = Integer.parseInt(data[1]);
            Person person = new Person(name, town, age);
            personInfo.add(person);
        }
        int n = Integer.parseInt(scan.nextLine());
        Person findPerson = personInfo.get(n - 1);
        long equals = personInfo.stream().filter(e -> findPerson.compareTo(e) == 0).count();
        if (equals == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", equals , personInfo.stream().filter(e -> findPerson.compareTo(e) != 0).count(), personInfo.size());
        }
    }
}
