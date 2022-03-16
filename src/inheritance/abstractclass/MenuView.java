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

    // Legg merke til at denne klassen ikke har en konstruktør. Jeg har valgt å ikke lage det siden klassen er
    // abstrakt, og vi aldri skal opprette et objekt av den.


    // METHODS

    // En metode som printer 24 ord til konsollen, arrangert utifra numberOfColumns- og numberOfRows-fields.
    // Prøv å bruke debugger for å gå linje for linje gjennom denne koden om det er vanskelig å følge logikken.
    // Da vil det være lettere å se hvordan de forskjellige verdiene endres underveis.
    public void showMenu() {

        // Dette tallet brukes til å velge hvilket element i menuAlternatives-arrayet vi skal printe.
        // Vi setter denne til 0 først, siden det første elementet har indeks 0
        int index = 0;

        // Vi vil printe et antall linjer bestemt av numberOfRows, derfor begynner vi med en fori-loop
        // som kjører så lenge i er mindre enn numberOfRows
        for (int i = 0; i < numberOfRows; i++) {

            // På begynnelsen av hver gjennomkjøring av den ytre loopen, må vi ha en tom string å sette
            // menyalternativene i
            String row = "";

            // Antallet menyalternativer på hver linje er bestemt av numberOfColumns.
            // Derfor kjører den indre loopen så lenge j er mindre enn numberOfColumns.
            // Legg merke til at vi må bruke j her, og ikke i. Dette er fordi i er definert i den ytre loopen,
            // og kan ikke brukes igjen i den indre.
            for (int j = 0; j < numberOfColumns; j++) {

                // Vi legger et menyalternativ til row-stringen. Menyalternativet er bestemt av index-variabelen,
                // som starter på 0. I tillegg har vi et par mellomrom etter, for å gjøre ting litt mer lettlest.
                row = row + menuAlternatives[index] + "    ";

                // Deretter øker vi index-variabelen med 1, sånn at vi kan legge til neste menyalternativ i neste
                // gjennomkjøring av den indre loopen.
                index++;
            }

            // Til slutt i den ytre loopen printer vi raden (linja) til konsollen
            System.out.println(row);
        }
    }

    // Alle klasser som arver fra MenuView MÅ implementere denne metoden, siden den er abstrakt
    public abstract void showDevice();

    // Siden alle klasser arver fra Object-klassen (trykk på den lille blå O-en til venstre for "public String toString()
    // for å se), må vi bruke annotasjonen @Override for å vise av vi lager en egen versjon av denne metoden.
    // @Override trenger ikke å være der, men det er best practice, for å kunne vise andre (eller seg selv i fremtiden)
    // at dette er en metode som fins i overklassen, som vi har laget en egen versjon av.
    @Override
    public String toString() {
        return "MenuView{" +
                "numberOfColumns=" + numberOfColumns +
                ", numberOfRows=" + numberOfRows +
                ", menuAlternatives= A to X in the English phonetic alphabet" +
                '}';
    }
}
