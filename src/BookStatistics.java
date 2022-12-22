public class BookStatistics implements Visitor{
    private int NrOfImages  = 0;
    private int NrOfTables = 0;
    private int NrOfParagraphs = 0;


    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.NrOfParagraphs = this.NrOfParagraphs+1;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        this.NrOfImages = this.NrOfImages+1;
    }

    @Override
    public void visitImage(Image image) {
    this.NrOfImages = this.NrOfImages+1;
    }

    @Override
    public void visitTable(Table table) {
        this.NrOfTables = this.NrOfTables+1;
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + this.NrOfImages);
        System.out.println("*** Number of tables: " + this.NrOfTables);
        System.out.println("*** Number of paragraphs: " + this.NrOfParagraphs);

    }
}
