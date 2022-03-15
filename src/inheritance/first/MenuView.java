package inheritance.first;

import java.util.ArrayList;

public abstract class MenuView {

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

    public double getNumberOfColumns() {
        return numberOfColumns;
    }

    public double getNumberOfRows() {
        return numberOfRows;
    }

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
}
