import debug.DebuggerPractice;
import inheritance.abstractclass.*;
import inheritance.interfaces.*;

public class ClassNameIsNotImportant {

    public static void main(String[] args) {


        // Kommenter ut de delene du ikke vil skal vises i konsollen



        // Debugger-del:

        // Lager et objekt av klassen DebuggerPractice
        DebuggerPractice debugP = new DebuggerPractice();

        // Setter ourInt-fieldet til å være 10
        debugP.setOurInt(10);

        // Setter ourString-fieldet til å være "Yo ho, yo ho, a pirate's life for me!")
        debugP.setOurString("Yo ho, yo ho, a pirate's life for me!");

        // Printer begge fields til konsollen
        System.out.println("\nOur int is now " + debugP.getOurInt());
        System.out.println("Our string is now " + debugP.getOurString());

        // Endrer på fields
        debugP.capitalizeOurString();
        debugP.doubleOurInt();

        // Printer begge fields til konsollen igjen
        System.out.println("\nOur int is now " + debugP.getOurInt());
        System.out.println("Our string is now " + debugP.getOurString());



        // Arv-del:

        // Oppretter tre objekter av klasser som alle arver fra MenuView
        ComputerMenuView pcView = new ComputerMenuView();
        TabletMenuView tabletView = new TabletMenuView();
        MobileMenuView mobileView = new MobileMenuView();

        // Kun for å få to tomme linjer i konsollen
        System.out.println("\n");

        // Kjører showDevice- og showMenu-metodene på alle tre objekter

        pcView.showDevice();
        pcView.showMenu();

        System.out.println("\n");

        tabletView.showDevice();
        tabletView.showMenu();

        System.out.println("\n");

        mobileView.showDevice();
        mobileView.showMenu();



        // Interface-del:

        // Oppretter et array som skal inneholde objekter av klasser som implementerer interfacet HasGenres
        HasGenres[] collections = {
                new MovieCollection(),
                new BookCollection(),
                new GameCollection()
        };

        // Bruker en foreach-loop til å gå gjennom alle elementer i collections-arrayet
        for (HasGenres thing : collections) {

            // Tom linje for lesbarhet
            System.out.println();

            // Kjører showGenres-metoden på hver "ting" i collections-arrayet
            thing.showGenres();
        }

        // Samme funksjonalitet som foreach-loopen, bare som en fori-loop
//        for (int i = 0; i < collections.length; i++) {
//            System.out.println();
//            collections[i].showGenres();
//        }

    }
}
