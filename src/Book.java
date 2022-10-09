import java.util.ArrayList;
import java.util.List;

public class Book {

    List<String> paragraph = new ArrayList<String>();
    List<String> image = new ArrayList<String>();
    List<String> table = new ArrayList<String>();
    public Book(String disco_titanic) {

    }

    public void createNewParagraph(String s) {
        paragraph.add(s);
    }

    public void createNewImage(String s) {
        image.add(s);
    }

    public void createNewTable(String s) {
        table.add(s);
    }
    public void print() {

        paragraph.forEach(System.out::println);
        image.forEach(System.out::println);
        table.forEach(System.out::println);

    }

}