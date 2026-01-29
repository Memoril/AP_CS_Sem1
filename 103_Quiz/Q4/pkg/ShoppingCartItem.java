package pkg;
import java.util.*;

public class ShoppingCartItem {
    //global variables
    private String itemName;
    private double itemCost;
    private int quantity;
    
    //constructors
    public ShoppingCartItem() {
        itemName = "banana";
        itemCost = 1.1;
        quantity = 1;
    }
    public ShoppingCartItem(String a, double b, int c) {
        itemName = a;
        itemCost = b;
        quantity = c;
    }
    
    //methods
    public void cartToString() {
        System.out.println(quantity + " " + itemName + " costs $" + itemCost + ".");
    }
    //pt 3
    public String getItemName() {
        return itemName;
    }
    public double getTotalCost() {
        return itemCost;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getTotalWithTax() {
        double b = itemCost + (itemCost * 0.12);
        return b;
    }
    //pt 4
    public double quantityToCostCalculator(int a) {
        double x = itemCost/quantity;
        double y = x * a;
        return y;
    } 
    //pt5
    public boolean compareItemCost(ShoppingCartItem a) {
        if (itemCost < a.getTotalCost()) {
            return true;
        }
        else {
            return false;
        }
    }
    //pt6
    public ShoppingCartItem copyCart() {
        String a = item2.getItemName();
        double b = item2.getTotalCost();
        int c = item2.quantity();
        return
    }
}
