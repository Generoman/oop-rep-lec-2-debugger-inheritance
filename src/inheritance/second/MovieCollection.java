package inheritance.second;

public class MovieCollection implements HasCategories {

    @Override
    public void showGenres() {
        System.out.println("Action");
        System.out.println("Drama");
        System.out.println("Comedy");
    }
}
