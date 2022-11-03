public class AlignCenter implements AlignStrategy{
    @Override
    public void render(String paragraph, Context c) {
        System.out.println(" # # "+ paragraph+ " # # ");
    }
}
