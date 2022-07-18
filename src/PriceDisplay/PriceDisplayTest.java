package PriceDisplay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class PriceDisplayTest {

    @Test
    public void displayPrice() {
        PriceDisplay priceDisplay = new PriceDisplay();
        assertEquals(priceDisplay.getPriceLabel("oranges", 1.99), String.format("The price for item: oranges is £1.99"));
    }

}