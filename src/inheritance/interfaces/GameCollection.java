package inheritance.interfaces;

public class GameCollection implements HasGenres {

    // Denne klassens implementasjon av showGenres-metoden
    @Override
    public void showGenres() {
        System.out.println("FPS");
        System.out.println("RPG");
        System.out.println("Action-Adventure");
    }
}
