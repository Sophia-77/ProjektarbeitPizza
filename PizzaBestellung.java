import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PizzaBestellung extends JFrame {
    private JPanel myPanel;
    private JLabel labelSorten;
    private JComboBox<String> comboSorten;
    private JLabel labelGroesse;
    private JComboBox<String> comboGroesse;
    private JLabel labelBelag1;
    private JComboBox<String> comboBelag1;
    private JLabel labelBelag2;
    private JComboBox<String> comboBelag2;
    private JLabel labelMenge;
    private JTextArea textAreaAusgabe;
    private JTextField textFieldMenge;
    private JButton preisButton;
    private JButton hinzufuegenButton;
    private JLabel labelPreis;
    private JTextField textFieldPreis;
    private JButton buttonFiltern;
    private JScrollPane scrollPane;
    private List<Pizza> pizzaListe;
    private static final double preisBelag = 0.5;
    private int menge;

    private void MenueListe() {
        pizzaListe = new ArrayList<>();
        initObjekte();


    }

    public PizzaBestellung() {
        setTitle("MiaPizzaria");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 500);
        setContentPane(myPanel);
        setVisible(true);
        setResizable(false);

        myPanel.setBackground(new Color(237, 120, 78, 190));


        hinzufuegenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenueListe();
                hinzufuegen();
            }
        });

        preisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                berechnePreis();
            }
        });

        buttonFiltern.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filterVegetarisch();

            }
        });
    }

    public void comboObjekte() {
        comboSorten.removeAllItems();
        comboGroesse.removeAllItems();
        comboBelag1.removeAllItems();
        comboBelag2.removeAllItems();

        comboSorten.addItem("Margherita");
        comboSorten.addItem("Hawaii");
        comboSorten.addItem("Tonno");
        comboSorten.addItem("Frutti di Mare");

        comboGroesse.addItem("S");
        comboGroesse.addItem("M");
        comboGroesse.addItem("L");

        comboBelag1.addItem("keinen");
        comboBelag1.addItem("Extra Käse");
        comboBelag1.addItem("Zwiebel");
        comboBelag1.addItem("Extra Ananas");

        comboBelag2.addItem("keinen");
        comboBelag2.addItem("Extra Käse");
        comboBelag2.addItem("Pilze");
    }


    public void hinzufuegen() {
        try {
            String pizzaSorten = comboSorten.getSelectedItem().toString();
            String selectedGroesse = comboGroesse.getSelectedItem().toString();
            char groesse = selectedGroesse.charAt(0);
            String belag1 = comboBelag1.getSelectedItem().toString();
            String belag2 = comboBelag2.getSelectedItem().toString();
            menge = Integer.parseInt(textFieldMenge.getText());

            if (menge <= 0) {
                throw new NumberFormatException("Die Menge muss größer als 0 sein.");
            }

            double preis = getGesamtPreis();
            Pizza neuePizza = new Pizza(pizzaSorten, belag1, belag2, groesse, preis, menge);
            pizzaListe.add(neuePizza);

            StringBuilder output = new StringBuilder("Gespeicherte Pizzen");
            for (Pizza pizza : pizzaListe) {
                output.append(pizza);
            }


            textAreaAusgabe.append(neuePizza.toString() + "\n");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Bitte geben Sie eine gültige Menge ein!", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void berechnePreis() {
        try {
            menge = Integer.parseInt(textFieldMenge.getText());
            if (menge <= 0) {
                throw new NumberFormatException("Die Menge muss größer als 0 sein.");
            }
            double preis = getGesamtPreis();
            textFieldPreis.setText(String.valueOf(preis));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Bitte geben Sie eine gültige Menge ein!", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }

    public double getGesamtPreis() {
        String pizzaSorten = comboSorten.getSelectedItem().toString();
        double pizzaPreis = getPizzaPreis(pizzaSorten);
        double groessePreis = getGroessePreis(comboGroesse.getSelectedItem().toString().charAt(0));
        double zusatzBelag = getZusatzBelagPreis(comboBelag1.getSelectedItem().toString(), comboBelag2.getSelectedItem().toString());
        return menge * (pizzaPreis + groessePreis + zusatzBelag);
    }

    public double getPizzaPreis(String sorte) {
        switch (sorte) {
            case "Margherita":
                return 11.0;
            case "Tonno":
                return 13.0;
            case "Hawaii":
                return 13.5;
            case "Frutti di Mare":
                return 15.0;
            default:
                throw new IllegalArgumentException("Bitte wählen Sie eine Sorte aus.");
        }
    }

    public double getGroessePreis(char groesse) {
        switch (groesse) {
            case 'S':
                return 0.0;
            case 'M':
                return 1.0;
            case 'L':
                return 2.0;
            default:
                throw new IllegalArgumentException("Bitte wählen Sie eine Größe aus.");
        }
    }

    public double getZusatzBelagPreis(String belag1, String belag2) {
        double preis = 0.0;
        if (!belag1.equals("keinen")) preis += preisBelag;
        if (!belag2.equals("keinen")) preis += preisBelag;
        return preis;
    }

    //Filter erstellen
    public void filterVegetarisch() {
        // TextArea leeren, um die gefilterten Ergebnisse anzuzeigen
        textAreaAusgabe.setText("");

        // Durch die Liste der Bestellungen iterieren
        for (Pizza p : pizzaListe) {
            if (isVegetarisch(p.getPizzaSorten())) {
                textAreaAusgabe.append(p.toString() + "\n"); // Zeige nur vegetarische Pizzen
            }
        }
    }

    // Liste der vegetarischen Sorten
    private boolean isVegetarisch(String sorte) {
        return sorte.equals("Hawaii") || sorte.equals("Margherita");
    }

    public void initObjekte() {
        pizzaListe.add(new Pizza("Margherita", "Zwiebel", "keinen", 'S', 11.5, 1));
        pizzaListe.add(new Pizza("Tonno", "Zwiebel", "Extra Käse", 'M', 14.5, 1));
        pizzaListe.add(new Pizza("Hawaii", "Extra Käse", "keinen", 'L', 16.0, 1));
        pizzaListe.add(new Pizza("Frutti di Mare", "keinen", "Pilze", 'M', 16.5, 1));


    StringBuilder output = new StringBuilder("Gespeicherte Pizzen");
            for( Pizza pizza :pizzaListe){
        output.append(pizza);
            }
            textAreaAusgabe.setText(output.toString());
}


    public static void main(String[] args) {
        new PizzaBestellung();
    }
}


