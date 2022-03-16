package inheritance.interfaces;

public class BookCollection implements HasGenres {

    // Denne klassens implementasjon av showGenres-metoden
    @Override
    public void showGenres() {
        System.out.println("Crime");
        System.out.println("Fantasy");
        System.out.println("Dictionary");
    }
}
