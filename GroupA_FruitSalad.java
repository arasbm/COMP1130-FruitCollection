import java.util.Scanner;

public class GroupA_FruitSalad{
    public static void main (String [] args) {
        
        double net_final_weight = 0;
        double final_weight;
        Banana banana = new Banana();
        Mango mango = new Mango();
        Guava guava = new Guava();
        int counter = 0;
        String confirm = "Y";
        int top;
        
      while( confirm.equals("Y"))
        {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("");
        System.out.print("Welcome to fruit salad maker ! \nPlease enter weight in front of the fruits marked \n");
        System.out.println("Enter banana weight:");
        banana.setBananaWeight(scan.nextDouble());
        System.out.println("How about some mangoes?:");
        mango.setMangoWeight(scan.nextDouble());
        System.out.println("And would you like some guava?");
        guava.setGuavaWeight(scan.nextDouble());

        final_weight = banana.getBananaWeight()+mango.getMangoWeight()+guava.getGuavaWeight();

        if (banana.getBananaWeight() < 0 || mango.getMangoWeight() < 0 || guava.getGuavaWeight()<0 ){
            System.out.println("You have entered a  value less than 0 which is not possible. Please try again again.");
        }

        else if( final_weight == 0){
            System.out.println("Your salad is empty! You have not put any fruits in it");
        }
        else{
            System.out.print("Your salad is ready> The ingredients are:");
            if (banana.getBananaWeight()>0){
                System.out.print("Banana,");
            }
            if (mango.getMangoWeight()>0){
                System.out.print("Mango,");
            }
            if (guava.getGuavaWeight()> 0) {
                System.out.print("Guava");
                System.out.println("");
            }
         Scanner sc = new Scanner(System.in);
         System.out.println("Do you want to add more salads?(Y/N)");
         confirm = sc.next();
         counter++;
            
         if (confirm.equals("Y")|| confirm.equals("y")||confirm.equals("N")||confirm.equals("n")){
             System.out.println("The weight of this salad is :"+final_weight + "grams");
             et_final_weight = net_final_weight + final_weight;
             }
          if(counter == 1){
              net_final_weight = final_weight;
             }
        if (confirm.equals("N")||confirm.equals("n")) {   
        System.out.println("\n The total weight of your salad is :"+ final_weight+"grams");
        System.out.println("Enjoy your salad!");
        System.out.println("Thank you ! Visit us again soon!");

             }
         }   
    }

}
