package inheritance.interfaces;

public class BookCollection implements HasCategories {

    @Override
    public void showGenres() {
        System.out.println("Crime");
        System.out.println("Fantasy");
        System.out.println("Dictionary");
    }
}
