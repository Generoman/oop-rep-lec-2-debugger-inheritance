package inheritance.second;

public class GameCollection implements HasCategories {

    @Override
    public void showGenres() {
        System.out.println("FPS");
        System.out.println("RPG");
        System.out.println("Action-Adventure");
    }
}
