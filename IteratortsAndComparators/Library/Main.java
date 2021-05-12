import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(new Book("The book", 1450), new Book("The book2"
                , 1921, "Carl Sagan", "Ann Druyan"));

        Iterator<Book> iterator = library.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
