package inheritance.abstractclass;

public abstract class MenuView {

    // FIELDS

    protected int numberOfColumns;
    protected int numberOfRows;
    protected String[] menuAlternatives = {
            "alpha",
            "bravo",
            "charlie",
            "delta",
            "echo",
            "foxtrot",
            "golf",
            "hotel",
            "india",
            "juliett",
            "kilo",
            "lima",
            "mike",
            "november",
            "oscar",
            "papa",
            "quebeq",
            "romeo",
            "sierra",
            "tango",
            "uniform",
            "victor",
            "whiskey",
            "x-ray"
    };


    // METHODS

    public void showMenu() {

        int counter = 0;

        for (int i = 0; i < numberOfRows; i++) {

            String row = "";

            for (int j = 0; j < numberOfColumns; j++) {
                row = row + menuAlternatives[counter] + "    ";
                counter++;
            }

            System.out.println(row);
        }
    }

    // Alle klasser som arver fra MenuView MÅ implementere denne metoden, siden den er abstrakt
    public abstract void showDevice();
}
