import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Section implements Element{


    public String getTitle() {
        return title;
    }

    private String title;
    List<Element> element = new ArrayList<Element>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(getClass().getName() + ": " + getTitle());

        Iterator<Element> it = element.iterator();

        while (it.hasNext()) {
            Element elemente = it.next();
            elemente.print();
        }
    }

    @Override
    public void add(Element elemente) {
        element.add(elemente);
    }

    @Override
    public void addContent(Element elemente) {
        element.add(elemente);
    }

    @Override
    public void remove(Element elemente) {
        element.remove(elemente);
    }

    @Override
    public Element get(int i) {
        return element.get(i);
    }



}


