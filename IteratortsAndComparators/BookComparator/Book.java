import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
            setTitle(title);
            setYear(year);
            setAuthors(authors);
    }
    @Override
    public int compareTo(Book other){
        return Integer.compare(this.year, other.year);
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(String[] authors) {
        this.authors = Arrays.asList(authors);
    }
}
