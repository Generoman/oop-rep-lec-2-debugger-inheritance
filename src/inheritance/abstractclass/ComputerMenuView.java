package inheritance.abstractclass;

public class ComputerMenuView extends MenuView {

    // Siden denne klassen arver fra MenuView, trenger vi ikke å ha med fields her - de er allerede tilgjengelig

    // CONSTRUCTOR
    public ComputerMenuView() {
        // super-nøkkelordet refererer til noe som ligger i klassen vi arver fra
        super.numberOfColumns = 4;
        super.numberOfRows = 6;
    }

    // En implementasjon av den abstrakte metoden showDevice i MenuView
    @Override
    public void showDevice() {
        System.out.println("Running on a computer:\n");
    }
}
