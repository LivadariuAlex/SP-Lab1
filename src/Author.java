import java.util.ArrayList;
import java.util.List;

public class Author {
    private String nume ;
    private String surName;
    List<Author> authors = new ArrayList<Author>();


    public Author(String nume) {
        this.nume = nume;
        this.surName = surName;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public void print() {

        authors.forEach(System.out::println);


    }
}
