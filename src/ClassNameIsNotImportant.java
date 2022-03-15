import debug.DebuggerPractice;
import inheritance.first.ComputerMenuView;
import inheritance.first.MobileMenuView;
import inheritance.first.TabletMenuView;

public class ClassNameIsNotImportant {

    public static void main(String[] args) {

//        DebuggerPractice debugP = new DebuggerPractice();
//
//        debugP.setOurInt(10);
//        debugP.setOurString("Yo ho, yo ho, a pirate's life for me!");
//
//        System.out.println("\nOur int is now " + debugP.getOurInt());
//        System.out.println("Our string is now " + debugP.getOurString());
//
//        debugP.capitalizeOurString();
//        debugP.doubleOurInt();
//
//        System.out.println("\nOur int is now " + debugP.getOurInt());
//        System.out.println("Our string is now " + debugP.getOurString());

        ComputerMenuView pcView = new ComputerMenuView();
        TabletMenuView tabletView = new TabletMenuView();
        MobileMenuView mobileView = new MobileMenuView();

        pcView.showMenu();
        System.out.println("\n");

        tabletView.showMenu();
        System.out.println("\n");

        mobileView.showMenu();
        System.out.println("\n");
    }
}
