package IteratorsAndComparators.StackIterator;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Stack customStack = new Stack();
        Arrays.stream(scan.nextLine().replaceAll("Push\\s+","").trim().split(", ")).mapToInt(Integer::parseInt).forEach(customStack::push);
        String command;
        while (!"END".equals(command=scan.nextLine())){
            String [] input = command.split("\\s+");
            if(input[0].equals("Pop")){
                try{
                    customStack.pop();
                }catch (IllegalStateException ex){
                    System.out.println(ex.getMessage());
                }

            }else if(input[0].equals("Push")){
                customStack.push(Integer.parseInt(input[1].trim()));
            }
        }
        IntStream.range(0, 2).forEach(i -> {
            for (Integer integer : customStack) {
                System.out.println(integer);
            }
        });
    }
}
