package inheritance.interfaces;

public class MovieCollection implements HasGenres {

    // Denne klassens implementasjon av showGenres-metoden
    @Override
    public void showGenres() {
        System.out.println("Action");
        System.out.println("Drama");
        System.out.println("Comedy");
    }
}
