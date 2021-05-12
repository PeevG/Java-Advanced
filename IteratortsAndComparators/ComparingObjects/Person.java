package IteratorsAndComparators.ComparingObjects;

public class Person implements Comparable<Person> {

    private String name;
    private String town;
    private int age;

    public Person(String name, String town, int age) {
        this.name = name;
        this.town = town;
        setAge(age);
    }

    private void setAge(int age) {
        if(age<0){
         throw new IllegalArgumentException("You can not create person whit negative age!");
        }
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.name.compareTo(o.name);
        if(result==0){
            result = Integer.compare(this.age,o.age);
        }
        if(result==0){
           result = this.town.compareTo(o.town);
        }
        return result;
    }
}
