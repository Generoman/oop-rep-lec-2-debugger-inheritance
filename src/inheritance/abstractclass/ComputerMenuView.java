package inheritance.abstractclass;

public class ComputerMenuView extends MenuView {

    public ComputerMenuView() {
        super.numberOfColumns = 4;
        super.numberOfRows = 6;
    }

    @Override
    public void showDevice() {
        System.out.println("Running on a computer:\n");
    }
}
