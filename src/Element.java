import java.util.ArrayList;
import java.util.List;

public interface Element {

    public void print();
    public void add(Element elemente);
    public void addContent(Element elemente);
    public void remove(Element elemente);
    public Element get(int i);
}
