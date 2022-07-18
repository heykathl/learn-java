package PriceDisplay;

public class PriceDisplay {

    public static void main(String[] args) {
        String item = "Coffee";
        Double price = 5.99;
        System.out.printf("The price is the item %s is £%.2f \n", item, price);
    }

    public static String getPriceLabel(String item, double price){
        return "The price for item: " + item + " is " + "£" + price;
//        return String.format("The price for item: %s is $%o", item, price);
    }
}