package IteratorsAndComparators.StrategyPattern;
//created by J.M.

import java.util.Comparator;
import java.util.Locale;

public class ComparatorByName implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        int result = Integer.compare(first.getName().length(), second.getName().length());
        return result != 0 ? result : Integer.compare(first.getName().toLowerCase(Locale.ROOT).charAt(0), second.getName().toLowerCase(Locale.ROOT).charAt(0));
    }
}
