public class Main {
    public static void main(String[] args) {

    Jar<Integer> jar = new Jar<>();

    jar.add(5);
    jar.add(1);
    jar.add(2);
    jar.add(3);

    jar.remove();
    jar.remove();

    }
    public static void print(Object num){
        System.out.println(num);
    }
}
