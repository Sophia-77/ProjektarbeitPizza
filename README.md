
 Projektarbeit Pizza🍕

Our project "MiaPizzeria" focuses on a digital menu system that enables users to place their orders quickly and conveniently. This digital solution enhances efficiency by saving valuable
time for the staff. The system is designed to be both sustainable and user-friendly. Additionally, "MiaPizzeria" includes a filtering feature that allows users to easily identify vegetarian
pizza options.

The project is divided into two main classes "Pizza" and "PizzaBestellung".

Class descriptions:

1. Pizza class
   
   The "Pizza" class defines the structure of a single pizza order. It includes attributes, a constructor to initialize them and methods to interact with these attributes.
   The attributes represent the details of the pizza and the constructor initializes the pizza attributes when a new pizza object is created.
   Getter and setter methods are used to retrieve and modify the values of the attributes, ensuring encapsulation.

2. PizzaBestellung Class
   
   The "PizzaBestellung" class handles the GUI and the core functionality of the application. It extends JFrame to create the graphical interface. The graphical interface includes dropdown
   menus for pizza options, text fields for input and display, buttons for user interactions and a text area to show the order list.
   Our key methods are:
   - Add order (hinzufuegen) adds a new pizza order based on user input and displays it in the GUI.
   - Calculate Price (berechnePreis) calculates the total price of the current order based on selected options and quantity.
   - Filter Vegetarian (filterVegetarisch) filters the order list to show only vegetarian pizzas.
   - Total Price Calculation (getGesamtPreis) computes the total price for an order, including the base price, size adjustments and additional toppings.
  


   

