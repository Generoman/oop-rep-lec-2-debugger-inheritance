package inheritance.abstractclass;

public class MobileMenuView extends MenuView {

    public MobileMenuView() {
        super.numberOfColumns = 2;
        super.numberOfRows = 12;
    }

    @Override
    public void showDevice() {
        System.out.println("Running on a phone:\n");
    }
}
