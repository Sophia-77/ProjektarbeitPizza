package Projekt;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import java.util.Objects;

public class Pizza{
    private JPanel MyPanel;
    private JLabel PizzaSorte;
    public JComboBox PizzaSorten;
    public JLabel Belag1;
    public JLabel Belag2;
    private JComboBox Belagart1;
    private JComboBox Belagart2;
    private JButton Hinzufügen;
    private JTextArea Bestellübersicht;
    private JButton Preisberechnen;
    private JLabel Preis;
    private JTextField Betrag;
    private JButton Kaufen;
    private JButton Abbruch;
    private JLabel Euro;
    private JLabel Warenkorb;
    public JLabel Größe;
    private JComboBox comboBoxGröße;
    private JTextField Anzahl;

    public Pizza(String margherita, String extraKäse, String keinen, char s, double v) {
    }
}
// Klasse Pizza mit ihren Attributen
class Pizzen {
    String PizzaSorten;
    String Belag1;
    String Belag2;
    char Größe;
    double Preis;

    //Konstruktor der Klasse Pizza
    public Pizzen(String pizzaSorten, String belag1, String belag2, char größe, double preis) {
        this.PizzaSorten = pizzaSorten;
        this.Belag1 = belag1;
        this.Belag2 = belag2;
        this.Größe = größe;
        this.Preis = preis;
    }


    // Klasse Fenster
    public class Fenster extends JFrame {

        private static final long serialVersionUID = 1L;
        private JPanel contentMyPanel;
        private JLabel lblWarenkorb;
        private JLabel lblPreis;
        private JTextField textFieldAnzahl;
        private JButton btnHinzufügen;
        private JButton btnPreisberechnen;
        private JButton btnKaufen;
        private JButton btnAbbruch;
        private JComboBox<String> comboBoxPizzaSorten;
        private JLabel lblGröße;
        private JComboBox<String> comboBoxBelagart1;
        private JComboBox<String> comboBoxBelagart2;
        private JComboBox<String> comboBoxGröße;
        private JTextArea textAreaBestellübersicht;
        private JLabel lblEuro;
        private JLabel lblBelag1;
        private JLabel lblBelag2;
        private JLabel lblPizzaSorte;

        private ArrayList<Pizza> pizzaList = new ArrayList<>();

        public double gesamtPreis = 0.0;

        private Pizza margheritaS;
        private Pizza margheritaM;
        private Pizza margheritaL;
        private Pizza tonnoS;
        private Pizza tonnoM;
        private Pizza tonnoL;
        private Pizza hawaiiS;
        private Pizza hawaiiM;
        private Pizza hawaiiL;
        private Pizza fruttiDiMareS;
        private Pizza fruttiDiMareM;
        private Pizza fruttiDiMareL;
        private Pizza SucukM;



        public Fenster() {
            setTitle("MiaPizzeria");

// Bestehende Objekte der Klasse Pizza
            margheritaS = new Pizza("Margherita", "Extra Käse", "keinen", 'S', 7.5);
            margheritaM = new Pizza("Margherita", "Extra Käse", "keinen", 'M', 9.5);
            margheritaL = new Pizza("Margherita", "Extra Käse", "keinen", 'L', 11.5);
            hawaiiS = new Pizza("Hawaii", "Extra Ananas", "Extra Käse", 'S', 9.0);
            hawaiiM = new Pizza("Hawaii", "Extra Ananas", "Extra Käse", 'M', 11.0);
            hawaiiL = new Pizza("Hawaii", "Extra Ananas", "Extra Käse", 'L', 13.0);
            tonnoS = new Pizza("Tonno", "Zwiebel", "keinen", 'S', 9.5);
            tonnoM = new Pizza("Tonno", "Zwiebel", "keinen", 'M', 11.5);
            tonnoL = new Pizza("Tonno", "Zwiebel", "keinen", 'L', 13.5);
            fruttiDiMareS = new Pizza("Frutti di Mare", "Extra Käse", "Meeresfrüchte", 'S', 12.0);
            fruttiDiMareM = new Pizza("Frutti di Mare", "Extra Käse", "Meeresfrüchte", 'M', 14.0);
            fruttiDiMareL = new Pizza("Frutti di Mare", "Extra Käse", "Meeresfrüchte", 'L', 16.0);


// Fenster Komponenten
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 719, 229);
            contentMyPanel = new JPanel();
            contentMyPanel.setBackground(new Color(248, 115, 130));
            contentMyPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

            setContentPane(contentMyPanel);
            contentMyPanel.setLayout(null);

            JLabel lblGröße = new JLabel("Größe:");
            lblGröße.setFont(new Font("Gadugi", Font.BOLD, 13));
            lblGröße.setBounds(10, 27, 62, 13);
            contentMyPanel.add(lblGröße);

            comboBoxGröße = new JComboBox<>();
            comboBoxGröße.setBackground(new Color(255, 255, 255));
            lblGröße.setFont(new Font("Gadugi", Font.BOLD, 13));
            lblGröße.setBounds(63, 20, 93, 26);
            contentMyPanel.add(comboBoxBelagart1);


            comboBoxGröße.addItem("S");
            comboBoxGröße.addItem("M");
            comboBoxGröße.addItem("L");

            lblPizzaSorte = new JLabel("Pizza Sorten");
            lblPizzaSorte.setFont(new Font("Gadugi", Font.BOLD, 13));
            lblPizzaSorte.setBackground(new Color(248, 115, 130));
            lblPizzaSorte.setBounds(10, 54, 115, 21);
            contentMyPanel.add(lblPizzaSorte);

            comboBoxPizzaSorten = new JComboBox<>();
            comboBoxPizzaSorten.setBackground(new Color(255, 255, 255));
            comboBoxPizzaSorten.setFont(new Font("Gadugi", Font.BOLD, 13));
            comboBoxPizzaSorten.setBounds(10, 81, 146, 26);
            contentMyPanel.add(comboBoxPizzaSorten);

            comboBoxPizzaSorten.addItem("Margherita");
            comboBoxPizzaSorten.addItem("Hawaii");
            comboBoxPizzaSorten.addItem("Tonno");
            comboBoxPizzaSorten.addItem("Frutti di Mare");


            lblBelag1 = new JLabel("1. Belag:");
            lblBelag1.setFont(new Font("Gadugi", Font.BOLD, 13));
            lblBelag1.setBounds(172, 87, 62, 16);
            contentMyPanel.add(lblBelag1);

            comboBoxBelagart1 = new JComboBox<>();
            comboBoxBelagart1.setBackground(new Color(255, 255, 255));
            comboBoxBelagart1.setFont(new Font("Gadugi", Font.BOLD, 13));
            comboBoxBelagart1.setBounds(231, 82, 123, 26);
            contentMyPanel.add(comboBoxBelagart1);

            comboBoxBelagart1.addItem("Extra Käse");
            comboBoxBelagart1.addItem("Extra Ananas");
            comboBoxBelagart1.addItem("Zwiebel");
            comboBoxBelagart2.addItem("keinen");


            lblBelag2 = new JLabel("2. Belag:");
            lblBelag2.setFont(new Font("Gadugi", Font.BOLD, 13));
            lblBelag2.setBounds(172, 123, 62, 17);
            contentMyPanel.add(lblBelag2);

            comboBoxBelagart2 = new JComboBox<>();
            comboBoxBelagart2.setBackground(new Color(255, 255, 255));
            comboBoxBelagart2.setFont(new Font("Gadugi", Font.BOLD, 13));
            comboBoxBelagart2.setBounds(231, 118, 123, 26);
            contentMyPanel.add(comboBoxBelagart2);

            comboBoxBelagart2.addItem("keinen");
            comboBoxBelagart2.addItem("Meeresfrüchte");
            comboBoxBelagart2.addItem("Extra Käse");


            btnHinzufügen = new JButton("Hinzufügen");
            btnHinzufügen.setFont(new Font("Gadugi", Font.BOLD, 13));
            btnHinzufügen.setBackground(new Color(255, 255, 255));
            btnHinzufügen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    initObjekte();
                }
            });
            btnHinzufügen.setBounds(10, 153, 146, 21);
            contentMyPanel.add(btnHinzufügen);

            lblWarenkorb = new JLabel("Warenkorb:");
            lblWarenkorb.setFont(new Font("Gadugi", Font.BOLD, 13));
            lblWarenkorb.setBounds(172, 157, 85, 13);
            contentMyPanel.add(lblWarenkorb);

            lblWarenkorb = new JLabel();
            lblWarenkorb.setBackground(new Color(255, 255, 255));
            lblWarenkorb.setFont(new Font("Gadugi", Font.BOLD, 13));
            lblWarenkorb.setText("0");
            lblWarenkorb.setBounds(302, 154, 52, 19);
            contentMyPanel.add(lblWarenkorb);


            textAreaBestellübersicht = new JTextArea();
            textAreaBestellübersicht.setFont(new Font("Gadugi", Font.BOLD, 13));
            textAreaBestellübersicht.setBackground(new Color(255, 255, 255));
            textAreaBestellübersicht.setEditable(false);

            JScrollPane scrollPane = new JScrollPane(textAreaBestellübersicht);
            scrollPane.setBounds(367, 21, 328, 89);
            contentMyPanel.add(scrollPane);

            btnPreisberechnen = new JButton("Preis berechnen");
            btnPreisberechnen.setFont(new Font("Gadugi", Font.BOLD, 13));
            btnPreisberechnen.setBackground(new Color(255, 255, 255));
            btnPreisberechnen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    gesamtPreis = 0.0;

                    for (Pizza pizza : pizzaList) {
                        gesamtPreis += Preis;
                    }//warum geht pizza.preis nicht
                    kp

                    lblPreis.setText(String.format("%.2f", gesamtPreis));
                }
            });
            btnPreisberechnen.setBounds(367, 122, 152, 21);
            contentMyPanel.add(btnPreisberechnen);

            lblPreis = new JLabel("Preis:");
            lblPreis.setFont(new Font("Gadugi", Font.BOLD, 13));
            lblPreis.setBounds(543, 126, 62, 13);
            contentMyPanel.add(lblPreis);

            lblPreis = new JLabel();
            lblPreis.setBackground(new Color(255, 255, 255));
            lblPreis.setFont(new Font("Gadugi", Font.BOLD, 13));
            lblPreis.setText("0.00");
            lblPreis.setBounds(625, 123, 52, 19);
            contentMyPanel.add(lblPreis);


            lblEuro = new JLabel("€");
            lblEuro.setFont(new Font("Gadugi", Font.BOLD, 13));
            lblEuro.setBounds(683, 126, 12, 13);
            contentMyPanel.add(lblEuro);

            btnKaufen = new JButton("Kaufen");
            btnKaufen.setFont(new Font("Gadugi", Font.BOLD, 13));
            btnKaufen.setBackground(new Color(204, 255, 153));
            btnKaufen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        if (pizzaList.isEmpty()) {
                            throw new IllegalStateException("Fehler: Ihr Warenkorb ist leer");
                        }


                        comboBoxPizzaSorten.setSelectedIndex(0);
                        comboBoxGröße.setSelectedIndex(0);
                        comboBoxBelagart1.setSelectedIndex(0);
                        comboBoxBelagart2.setSelectedIndex(0);
                        lblWarenkorb.setText("0");
                        lblPreis.setText("0.00");
                        pizzaList.clear();
                        textAreaBestellübersicht.setText(" ");
                        JOptionPane.showMessageDialog(Fenster.this, "Danke für Ihre Bestellung, Guten Appetit!");
                    } catch (IllegalStateException ex) {
                        JOptionPane.showMessageDialog(Fenster.this, ex.getMessage());
                    }
                }
            });
            btnKaufen.setBounds(367, 153, 152, 21);
            contentMyPanel.add(btnKaufen);

            btnAbbruch = new JButton("Abbruch");
            btnAbbruch.setFont(new Font("Gadugi", Font.BOLD, 13));
            btnAbbruch.setBackground(new Color(255, 0, 0));
            btnAbbruch.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {


                    comboBoxPizzaSorten.setSelectedIndex(0);
                    comboBoxGröße.setSelectedIndex(0);
                    comboBoxBelagart1.setSelectedIndex(0);
                    comboBoxBelagart2.setSelectedIndex(0);
                    lblWarenkorb.setText("0");
                    lblPreis.setText("0.00");
                    pizzaList.clear();
                    textAreaBestellübersicht.setText(" ");

                    JOptionPane.showMessageDialog(Fenster.this, "Ihre Bestellung wurde abgebrochen.");
                }
            });
            btnAbbruch.setBounds(543, 153, 152, 21);
            contentMyPanel.add(btnAbbruch);

        }


        // Methode von btnHinzufügen - speichert bereits vorhandene und neu erstellte Objekte der Klasse Pizza in pizzaList
        private void initObjekte() {

// Fehlermeldung

//            //try{
//                //Umwandlung von String --> double
//                double wert= Double.parseDouble(textFieldAnzahl.getText());

            if (textFieldAnzahl.getSelectedText() && lblWarenkorb.getSelectedText()){
                JOptionPane.showMessageDialog(this, "Fehler: Ungültige Eingabe");
                return;
            }

// Fertige Sorten auswählen und speichern
            if (lblPizzaSorte.getSelectedText()) {
                if (comboBoxPizzaSorten.getSelectedText() && comboBoxPizzaSorten.getSelectedItem().equals("Margherita")
                        && comboBoxGröße.getSelectedItem().equals("S")) {
                    pizzaList.add(margheritaS);
                    lblWarenkorb.setText(String.valueOf(pizzaList.size()));
                    JOptionPane.showMessageDialog(this, " Pizza Margherita wurde hinzugefügt.");
                } else if (comboBoxPizzaSorten.getSelectedItem().equals("Margherita") && comboBoxGröße.getSelectedItem().equals("M")) {
                    pizzaList.add(margheritaM);
                    lblWarenkorb.setText(String.valueOf(pizzaList.size()));
                    JOptionPane.showMessageDialog(this, "Pizza Margherita wurde hinzugefügt.");
                } else if (comboBoxPizzaSorten.getSelectedItem().equals("Margherita") && comboBoxGröße.getSelectedItem().equals("L")) {
                    pizzaList.add(margheritaL);
                    lblWarenkorb.setText(String.valueOf(pizzaList.size()));
                    JOptionPane.showMessageDialog(this, "Pizza Margherita wurde hinzugefügt.");
                } else if (comboBoxPizzaSorten.getSelectedItem().equals("Tonno") && comboBoxGröße.getSelectedItem().equals("S")) {
                    pizzaList.add(tonnoS);
                    lblWarenkorb.setText(String.valueOf(pizzaList.size()));
                    JOptionPane.showMessageDialog(this, "Pizza Tonno wurde hinzugefügt.");
                } else if (comboBoxPizzaSorten.getSelectedItem().equals("Tonno") && comboBoxGröße.getSelectedItem().equals("M")) {
                    pizzaList.add(tonnoM);
                    lblWarenkorb.setText(String.valueOf(pizzaList.size()));
                    JOptionPane.showMessageDialog(this, "Pizza Tonno wurde hinzugefügt.");
                } else if (comboBoxPizzaSorten.getSelectedItem().equals("Tonno") && comboBoxGröße.getSelectedItem().equals("L")) {
                    pizzaList.add(tonnoL);
                    lblWarenkorb.setText(String.valueOf(pizzaList.size()));
                    JOptionPane.showMessageDialog(this, "Pizza Tonno wurde hinzugefügt.");
                } else if (comboBoxPizzaSorten.getSelectedItem().equals("Frutti di Mare") && comboBoxGröße.getSelectedItem().equals("S")) {
                    pizzaList.add(fruttiDiMareS);
                    lblWarenkorb.setText(String.valueOf(pizzaList.size()));
                    JOptionPane.showMessageDialog(this, "Pizza Frutti di Mare wurde hinzugefügt.");
                } else if (comboBoxPizzaSorten.getSelectedItem().equals("Frutti di Mare") && comboBoxGröße.getSelectedItem().equals("M")) {
                    pizzaList.add(fruttiDiMareM);
                    lblWarenkorb.setText(String.valueOf(pizzaList.size()));
                    JOptionPane.showMessageDialog(this, "Pizza Frutti di Mare wurde hinzugefügt.");
                } else if (comboBoxPizzaSorten.getSelectedItem().equals("Frutti di Mare") && comboBoxGröße.getSelectedItem().equals("L")) {
                    pizzaList.add(fruttiDiMareL);
                    lblWarenkorb.setText(String.valueOf(pizzaList.size()));
                    JOptionPane.showMessageDialog(this, "Pizza Frutti di Mare wurde hinzugefügt.");
                } else if (comboBoxPizzaSorten.getSelectedItem().equals("Frutti di Mare") && comboBoxGröße.getSelectedItem().equals("S")) {
                    pizzaList.add(hawaiiS);
                    lblWarenkorb.setText(String.valueOf(pizzaList.size()));
                    JOptionPane.showMessageDialog(this, "Pizza Hawaii wurde hinzugefügt.");
                } else if (comboBoxPizzaSorten.getSelectedItem().equals("Frutti di Mare") && comboBoxGröße.getSelectedItem().equals("M")) {
                    pizzaList.add(hawaiiM);
                    lblWarenkorb.setText(String.valueOf(pizzaList.size()));
                    JOptionPane.showMessageDialog(this, "Pizza Hawaii wurde hinzugefügt.");
                } else if (comboBoxPizzaSorten.getSelectedItem().equals("Frutti di Mare") && comboBoxGröße.getSelectedItem().equals("L")) {
                    pizzaList.add(hawaiiL);
                    lblWarenkorb.setText(String.valueOf(pizzaList.size()));
                    JOptionPane.showMessageDialog(this, "Pizza Hawaii wurde hinzugefügt.");
                }



                // Preis Größe
                if (Objects.equals(Größe, "M")) {
                    gesamtPreis += 2;
                } else if (Objects.equals(Größe, "L")) {
                    gesamtPreis += 2;
                }

                // Preis Beläge
                switch (Belag1) {
                    case "Zwiebel":
                        gesamtPreis += 1.0;
                        break;
                    case "Extra Ananas":
                        gesamtPreis += 1.5;
                        break;
                    case "Keinen":
                        gesamtPreis += 0.0;
                        break;
                }

                switch (Belag2) {
                    case "Keinen":
                        gesamtPreis += 0.0;
                        break;
                    case "Extra Käse":
                        gesamtPreis += 0.5;
                        break;
                    case "Meeresfrüchte":
                        gesamtPreis += 1.5;
                        break;
                }


                // Fehlermeldung
                if (lblBelag1.equals(lblBelag2)) {
                    JOptionPane.showMessageDialog(this, "Fehler: Bitte wählen Sie zwei unterschiedliche BelÃ¤ge aus. Wenn Sie nur einen Belag wollen, klicken Sie bitte unter 2. Belag auf 'keinen'");
                    comboBoxBelagart1.setSelectedIndex(0);
                    comboBoxBelagart2.setSelectedIndex(0);
                    return;
                }



                 //Objekt wird zur Liste hinzugefügt
                pizzaList.add(SucukM);
                JOptionPane.showMessageDialog(this, "Pizza " + SucukM.PizzaSorten + " wurde hinzugefügt.");

                lblWarenkorb.setText(String.valueOf(pizzaList.size()));


                // Fehlermeldung
            } else {
                JOptionPane.showMessageDialog(this, "Fehler: Bitte wähle zwischen Fertige Sorten und Selbstauswahl aus");
            }


            // Anzeige des Warenkorbs
            StringBuilder pizzaListText = new StringBuilder();
            for (Pizza pizza : pizzaList) {
                if (pizza.Belag1.equals("keinen")) {
                    pizzaListText.append("Pizza ").append(pizza.PizzaSorten).append(": ").append(pizza.Belag1)
                            .append(", ").append(pizza.Größe).append(System.lineSeparator());
                } else {
                    pizzaListText.append("Pizza ").append(pizza.PizzaSorten).append(": ").append(pizza.Belag1)
                            .append(", ").append(pizza.Belag2).append(", ").append(pizza.Größe)
                            .append(System.lineSeparator());
                }
            }
            textAreaBestellübersicht.setText(pizzaListText.toString());

        }

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Fenster frame = new Fenster();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}

