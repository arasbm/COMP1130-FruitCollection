import java.util.Scanner;

enum Toppings{                  //added by Anjali 
    Whipped_Cream,
    Chocolate,
    Lemon_Juice}

public class GroupA_FruitSalad {
    public static void main(String[] args) {

        double net_final_weight = 0;
        double final_weight;
        Banana banana = new Banana();
        Mango mango = new Mango();
        Guava guava = new Guava();
        int counter = 0;
        String confirm = "Y";
        int top;

        while (confirm.equals("Y")) {                                   //done by Yassh
            Scanner scan = new Scanner(System.in);
            System.out.print("\n");
            System.out.print("Welcome to fruit salad maker ! \nPlease enter weight in front of the fruits marked \n");
            System.out.println("Enter banana weight:");
            banana.setBananaWeight(scan.nextDouble());
            System.out.println("How about some mangoes?:");
            mango.setMangoWeight(scan.nextDouble());
            System.out.println("And would you like some guava?");
            guava.setGuavaWeight(scan.nextDouble());

            final_weight = banana.getBananaWeight() + mango.getMangoWeight() + guava.getGuavaWeight();


            if (banana.getBananaWeight() < 0 || mango.getMangoWeight() < 0 || guava.getGuavaWeight() < 0) {
                System.out.println("You have entered a  value less than 0 which is not possible. Please try again again.");
            }
            else if (final_weight == 0) {
                System.out.println("Your salad is empty! You have not put any fruits in it");
            }
            else {
                System.out.print("Your salad is ready> The ingredients are:");
                if (banana.getBananaWeight() > 0) {
                    System.out.print("Banana,");
                }

                if (mango.getMangoWeight() > 0) {
                    System.out.print("Mango,");
                }

                if (guava.getGuavaWeight() > 0) {
                    System.out.print("Guava");
                    System.out.println("\n");
                }
                System.out.println("Choose Your Toppings: ");
                System.out.print("\nPress 1 for Whipped Cream \nPress 2 for Chocolate \nPress 3 for Lemon Juice \nPress 0 to continue without topping -- ");
                top = scan.nextInt();
                System.out.println();

                if (top == 1) {                                     //done by Behlah
                    System.out.println("You selected " + Toppings.Whipped_Cream + " topping");
                }
                else if (top == 2) {
                    System.out.println("You selected " + Toppings.Chocolate + " topping");
                }
                else if (top == 3) {
                    System.out.println("You selected " + Toppings.Lemon_Juice + " topping");
                }
                else if (top == 0) {
                    System.out.println("Yod did not opt for a topping!");
                }
                else {
                    System.out.println("Wrong Input!! Please enter a value from 0-3.");
                }
                System.out.print("\n");
                System.out.println("Do you want to add more salads?(Y/N)");
                confirm = scan.next();
                counter++;

                if (confirm.equals("Y") || confirm.equals("y") || confirm.equals("N") || confirm.equals("n")) {
                    System.out.println("The weight of this salad is :" + final_weight + "grams");
                    net_final_weight = net_final_weight + final_weight;
                }

                if (counter == 1) {
                    net_final_weight = final_weight;
                }

                if (confirm.equals("N") || confirm.equals("n")) {
                    System.out.println("\nThe total weight of your salad is :" + final_weight + "grams");
                    System.out.println("Enjoy your salad!");
                    System.out.println("Thank you ! Visit us again soon!");
                }
            }
        }
    }
}
