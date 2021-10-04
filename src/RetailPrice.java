import java.util.Scanner;

public class RetailPrice {
    public static void main (String[] args){
        String cont;
        double cost, retail, rate = 2.5;

        Scanner keybd = new Scanner((System.in));

        System.out.println("Enter wholesale cost: ");

        do {
            cost = keybd.nextDouble();
            retail = cost * rate;
            System.out.printf("Retail price is $%.2f \n", retail);
          //  System.out.println("retail price is: " + retail);
            System.out.print("Continue (y/n): ");
            cont = keybd.next();
        } while (cont == "y");
    }
}
