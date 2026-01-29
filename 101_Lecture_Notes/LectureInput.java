/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Double item1Price = 0.25;
        Double item2Price = 5.83;
        Double item3Price = 22.50;
        
        System.out.println();
        System.out.println("What's the name for the order?");
        String username = sc.nextLine();
        
        System.out.println("🥷 Welcome to Modern Delinquents! 🥷");
        System.out.println("Our Menu:");
        System.out.println("LIQUIDATION SALE!!");
        System.out.println("1. 🏎 Hot Wheels  -  $" + item1Price + " (99% OFF!)");
        System.out.println("2. ✈️ Airplanes   -  $" + item2Price + " (90% OFF)");
        System.out.println("3. 🌍 Earth:      -  $" + item3Price + " (%50 OFF!!!)");
        
        System.out.println();
        System.out.println("How many Hot Wheels would you like?");
        int quant1 = sc.nextInt();
        System.out.println("How many Airplanes would you like?");
        int quant2 = sc.nextInt();
        System.out.println("How many Earths would you like?");
        int quant3 = sc.nextInt();
        
        double price1 = (quant1 * item1Price);
        double price2 = (quant2 * item2Price); 
        double price3 = (quant3 * item3Price);
        double Tprice = (quant1 * item1Price) + (quant2 * item2Price) + (quant3 * item3Price);
        System.out.println();
        System.out.println("= $" + Tprice);
        
        System.out.println();
        System.out.println("What percent would you like to tip?: ");
        double tipPercent = sc.nextDouble();
        
        double tip = Tprice * (tipPercent/100);
        double grandTotal = tip + Tprice;
        System.out.println("RECIEPT:");
        System.out.println("Hot Wheels x" + quant1 + "       = " + price1);
        System.out.println("Airplanes x" + quant2 + "        = " + price2);
        System.out.println("Earths x" + quant3 + "           = " + price3);
        System.out.println("You tipped (" + tipPercent + "%)  = $" + tip);
        System.out.println("-------------------------------");
        System.out.println("Your Grand Total is: $" + grandTotal);
	}
}
