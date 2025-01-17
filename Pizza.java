public class Pizza {
    private String pizzaSorten;
    private String belag1;
    private String belag2;
    private char groesse;
    private double preis;
    private int menge;

    //Konstruktor der Klasse Pizza
    public Pizza(String pizzaSorten, String belag1, String belag2, char groesse, double preis, int menge) {
        this.pizzaSorten = pizzaSorten;
        this.belag1 = belag1;
        this.belag2 = belag2;
        this.groesse = groesse;
        this.preis = preis;
        this.menge = menge;
    }

    //Getter Methoden um den Wert eines Attributs zurück zu geben
    public String getPizzaSorten() {
        return pizzaSorten;
    }

    public char getGroesse() {
        return groesse;
    }

    public double getPreis() {
        return preis;
    }

    public int getMenge() {
        return menge;
    }

    public String getBelag1() {
        return belag1;
    }

    public String getBelag2() {
        return belag2;
    }

    //Setter Methoden um den Wert einer Attribute zu setzten
    public void setPizzaSorten (String pizzaSorten) {
        this.pizzaSorten = pizzaSorten;
    }

    public void setBelag1(String belag1) {
        this.belag1 = belag1;
    }

    public void setBelag2(String belag2) {
        this.belag2 = belag2;
    }

    public void setGroesse(char groesse) {
        this.groesse = groesse;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
    @Override
    public String toString() {
        return "Pizzasorte: " + pizzaSorten + "\n" + "Belag 1: " + belag1 + "\n" + "Belag 2: " + belag2 + "\n" +
                "Größe: " + groesse + "\n" + "Preis: " + preis + "\n" + "Menge: " + menge + "\n ----------------------------------------- \n";
    }
}
