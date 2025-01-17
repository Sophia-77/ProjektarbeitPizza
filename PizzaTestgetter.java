import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PizzaTestgetter {

    @Test
    void testconstructorgettermethoden() {
        Pizza pizza = new Pizza("Margherita", "Extra Käse", "keinen",'S', 11.5, 1);
//Überprüfen, ob die Attribute korrekt gesetzt wurde
        assertEquals("Margherita", pizza.getPizzaSorten());
        assertEquals("Extra Käse", pizza.getBelag1());
        assertEquals("keinen", pizza.getBelag2());
        assertEquals('S', pizza.getGroesse());
        assertEquals(11.5, pizza.getPreis());
        assertEquals(1, pizza.getMenge());


    }
}