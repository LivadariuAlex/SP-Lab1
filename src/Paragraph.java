import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Paragraph implements Element {

    public Paragraph(String text) {
        this.text = text;
    }

    private String text;
    List<Element> element = new ArrayList<Element>();


    @Override
    public void print() {
        System.out.println("Paragraph : " + text);
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