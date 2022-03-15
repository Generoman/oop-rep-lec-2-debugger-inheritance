public class ClassNameIsNotImportant {

    public static void main(String[] args) {

        DebuggerPractice debugP = new DebuggerPractice();

        debugP.setOurInt(10);
        debugP.setOurString("Yo ho, yo ho, a pirate's life for me!");

        System.out.println("\nOur int is now " + debugP.getOurInt());
        System.out.println("Our string is now " + debugP.getOurString());

        debugP.capitalizeOurString();
        debugP.doubleOurInt();

        System.out.println("\nOur int is now " + debugP.getOurInt());
        System.out.println("Our string is now " + debugP.getOurString());
    }
}
