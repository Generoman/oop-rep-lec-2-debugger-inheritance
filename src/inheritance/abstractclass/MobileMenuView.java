package inheritance.abstractclass;

public class MobileMenuView extends MenuView {

    // Siden denne klassen arver fra MenuView, trenger vi ikke å ha med fields her - de er allerede tilgjengelig

    // CONSTRUCTOR
    public MobileMenuView() {
        // super-nøkkelordet refererer til noe som ligger i klassen vi arver fra
        super.numberOfColumns = 2;
        super.numberOfRows = 12;
    }

    // En implementasjon av den abstrakte metoden showDevice i MenuView
    @Override
    public void showDevice() {
        System.out.println("Running on a phone:\n");
    }
}
