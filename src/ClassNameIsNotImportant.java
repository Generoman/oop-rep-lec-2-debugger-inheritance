import debug.DebuggerPractice;
import inheritance.abstractclass.ComputerMenuView;
import inheritance.abstractclass.MobileMenuView;
import inheritance.abstractclass.TabletMenuView;
import inheritance.interfaces.BookCollection;
import inheritance.interfaces.GameCollection;
import inheritance.interfaces.HasCategories;
import inheritance.interfaces.MovieCollection;

public class ClassNameIsNotImportant {

    public static void main(String[] args) {

        // Debugger-del:

        DebuggerPractice debugP = new DebuggerPractice();

        debugP.setOurInt(10);
        debugP.setOurString("Yo ho, yo ho, a pirate's life for me!");

        System.out.println("\nOur int is now " + debugP.getOurInt());
        System.out.println("Our string is now " + debugP.getOurString());

        debugP.capitalizeOurString();
        debugP.doubleOurInt();

        System.out.println("\nOur int is now " + debugP.getOurInt());
        System.out.println("Our string is now " + debugP.getOurString());


        // Arv-del:

        ComputerMenuView pcView = new ComputerMenuView();
        TabletMenuView tabletView = new TabletMenuView();
        MobileMenuView mobileView = new MobileMenuView();

        System.out.println("\n");

        pcView.showDevice();
        pcView.showMenu();
        System.out.println("\n");

        tabletView.showDevice();
        tabletView.showMenu();
        System.out.println("\n");

        mobileView.showDevice();
        mobileView.showMenu();


        // Interface-del:

        HasCategories[] collections = {new MovieCollection(), new BookCollection(), new GameCollection()};

        for (HasCategories collection : collections) {
            System.out.println();
            collection.showGenres();
        }

    }
}
