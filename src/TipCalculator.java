import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class TipCalculator {
    Scanner scan = new Scanner(System.in);
    public TipCalculator() {
        ArrayList<String> items = new ArrayList<String>();
        System.out.println("Welcome to the Tip Calculator!");
        System.out.println("What percentage would you like to tip? (0%-100%)");
        int percentage = scan.nextInt();
        System.out.println("How many people are dining with you today? (including yourself) ");
        int numberOfPeople = scan.nextInt();
        //scan.nextLine();
        double cost = 0;
        double total = 0;
        while (cost != -1) {
            System.out.println("Enter the price of your item (enter -1 when done): ");
            cost = scan.nextDouble();
            total = total + cost;
            scan.nextLine();
            if (cost==-1){
                total++;
            }
            if(cost != -1){
                System.out.print("Enter the name of your item: ");
                String item = scan.nextLine();
                items.add(item);
                System.out.println("  ");
            }
        }
        double totalTip = (percentage/100.0)*total;
        double billWithTip = totalTip + total;
        double perPersonCost = total/ numberOfPeople;
        double tipPerPerson = totalTip/numberOfPeople;
        double totalCostPerPerson = billWithTip/numberOfPeople;
        totalTip = Math.round((totalTip*100));
        totalTip /=100;
        billWithTip = Math.round((billWithTip*100));
        billWithTip /=100;
        perPersonCost= Math.round((perPersonCost*100));
        perPersonCost /=100;
        tipPerPerson= Math.round((tipPerPerson*100));
        tipPerPerson /=100;
        totalCostPerPerson= Math.round((totalCostPerPerson*100));
        totalCostPerPerson /=100;
        System.out.println("--------------------------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total percentage: " + percentage + "%");
        System.out.println("Total tip: $" + totalTip);
        System.out.println("Total bill with tip: $" + billWithTip);
        System.out.println("Per person cost before tip: $" + perPersonCost);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total cost per person: $" + totalCostPerPerson);
        System.out.println("--------------------------------------------");

        System.out.println(items);

    }


}
