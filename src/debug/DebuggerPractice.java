package debug;

public class DebuggerPractice {

    // FIELDS

    private int ourInt;
    private String ourString;



    // GETTERS/SETTERS

    public int getOurInt() {
        return ourInt;
    }

    public void setOurInt(int ourInt) {
        this.ourInt = ourInt;
    }

    public String getOurString() {
        return ourString;
    }

    public void setOurString(String ourString) {
        this.ourString = ourString;
    }



    // METHODS

    // Denne metoden skal endre ourInt til å være dobbelt så stor
    // Akkurat nå er denne koden feil i forhold til hva vi vil den skal gjøre
    public int doubleOurInt() {
        return ourInt * 2;
    }

    // Denne metoden skal endre ourString til å bare inneholde store bokstaver
    // Akkurat nå er denne koden feil i forhold til hva vi vil den skal gjøre
    public String capitalizeOurString() {
        return ourString.toUpperCase();
    }

    // Riktig kode for begge metoder:
    // Merk av all utkommentert kode, og trykk ctrl og /
    // (cmd og 7 på mac)

//    public void doubleOurInt() {
//        ourInt = ourInt * 2;
//    }

//    public void capitalizeOurString() {
//        ourString = ourString.toUpperCase();
//    }
}
