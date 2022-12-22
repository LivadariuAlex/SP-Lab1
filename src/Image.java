import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Image implements Element {

    List<Element> element = new ArrayList<Element>();
    Image(String name) {
        image = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String image;


    @Override
    public void print() {
        System.out.println("Image with name: "+ image);

        for (Element elemente : element) {
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}
