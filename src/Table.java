import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Table implements Element {

    private String table;
    List<Element> element = new ArrayList<Element>();

    public Table(String table) {
        this.table = table;
    }


    @Override
    public  void print() {
        System.out.println("Title :" + table);
        Iterator<Element> it = element.iterator();

        while (it.hasNext()) {
            Element elemente = it.next();
            elemente.print();
        }


    }

    @Override
    public void add(Element elemente) {

    }

    @Override
    public void addContent(Element elemente) {

    }

    @Override
    public void remove(Element elemente) {

    }

    @Override
    public Element get(int i) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}









