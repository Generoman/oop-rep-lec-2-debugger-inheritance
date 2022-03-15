package inheritance.first;

public class TabletMenuView extends MenuView {

    public TabletMenuView() {
        super.numberOfColumns = 3;
        super.numberOfRows = 8;
    }

    @Override
    public void showDevice() {
        System.out.println("Running on a tablet:\n");
    }
}
