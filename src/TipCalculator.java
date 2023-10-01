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
        //makes the code repeat to ask for all the items ordered until -1 ia entered
        while (cost != -1) {
            System.out.print("Enter the price of your item (enter -1 when done): $");
            cost = scan.nextDouble();
            total = total + cost;
            scan.nextLine();
            if (cost==-1){  //makes sure -1 isn't added to the cost
                total++;
            }
            if(cost != -1){
                System.out.print("Enter the name of your item: ");
                String item = scan.nextLine();
                items.add(item);
                System.out.println("  ");
            }
        }
        //calculating all the variables needed
        double totalTip = (percentage/100.0)*total;
        double billWithTip = totalTip + total;
        double perPersonCost = total/ numberOfPeople;
        double tipPerPerson = totalTip/numberOfPeople;
        double totalCostPerPerson = billWithTip/numberOfPeople;
        double totalWithTax = total*1.08875;
        double totalCostWithTax = totalWithTax + totalTip;
        double totalCostPerPersonWithTax = totalCostWithTax/numberOfPeople;
        //making sure they are all rounded to the nearest two decimal points
        total = Math.round((total*100));
        total/= 100;
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
        totalCostWithTax= Math.round((totalCostWithTax*100));
        totalCostWithTax /=100;
        totalCostPerPersonWithTax= Math.round((totalCostPerPersonWithTax*100));
        totalCostPerPersonWithTax /=100;
        //prints all values
        System.out.println("--------------------------------------------");
        if ((total*10)%1 == 0){
            System.out.println("Total bill before tip: $" + total + "0");
        }else{
            System.out.println("Total bill before tip: $" + total);
        }
        System.out.println("Total percentage: " + percentage + "%");
        if ((totalTip*10)%1 == 0){
            System.out.println("Total tip: $" + totalTip + "0");
        }else{
            System.out.println("Total tip: $" + totalTip);
        }
        if ((billWithTip*10)%1 == 0){
            System.out.println("Total bill with tip: $" + billWithTip + "0");
        }else{
            System.out.println("Total bill with tip: $" + billWithTip);
        }
        if ((perPersonCost*10)%1 == 0){
            System.out.println("Per person cost before tip: $" + perPersonCost + "0");
        }else{
            System.out.println("Per person cost before tip: $" + perPersonCost);
        }
        if ((tipPerPerson*10)%1 == 0){
            System.out.println("Tip per person: $" + tipPerPerson + "0");
        }else{
            System.out.println("Tip per person: $" + tipPerPerson);
        }
        if ((totalCostPerPerson*10)%1 == 0){
            System.out.println("Total cost per person: $" + totalCostPerPerson + "0");
        }else{
            System.out.println("Total cost per person: $" + totalCostPerPerson);
        }
        if ((totalCostWithTax*10)%1 == 0){
            System.out.println("Total cost with tax : $" +totalCostWithTax + "0");
        }else{
            System.out.println("Total cost with tax : $" +totalCostWithTax);
        }
        if ((totalCostPerPersonWithTax*10)%1 == 0){
            System.out.println("Total cost per person with tax : $" +totalCostPerPersonWithTax);
        }else{
            System.out.println("Total cost per person with tax : $" +totalCostPerPersonWithTax);
        }
        System.out.println("--------------------------------------------");
        //prints list of all items ordered
        System.out.println("Items ordered: ");
        for (int i = 0; i < items.size(); i++)
            System.out.println(items.get(i));
    }


}
