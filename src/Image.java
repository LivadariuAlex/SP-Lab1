import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Image implements Element {

    List<Element> element = new ArrayList<Element>();
    public Image(String image) {
        this.image = image;
    }

    private String image;


    @Override
    public void print() {
        System.out.println("Image with name: "+ image);
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
