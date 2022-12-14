public class ImageProxy implements  Element{
    private String url;
    private Integer dim;

    private Image realImage = null;

    public ImageProxy(String url) {
        this.url = url;
    }


    Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;

    }
    @Override
    public void print() {
        System.out.println(url);
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
        visitor.visitImageProxy(this);

    }

}
