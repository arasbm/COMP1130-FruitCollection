/*Group F
Members: Oloyede Olajide Daniel
Jesutofunmi Adebayo
Mohammed Kaba
*fruit salad*
 */
package FruitSalad;
import java.util.Scanner;

public class GroupF_FruitSalad {

    public static void main(String[] args) {
        double raspberry,apricot,ugli,sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Group F's Fruit salad maker! Please enter how many grams of Raspberry you want in your salad");
        raspberry = scan.nextDouble();
        System.out.println("How much Apricot would you like in your salad(in grams):");
        apricot = scan.nextDouble();
        System.out.println("How much Ugli would you like?(in grams):");
        ugli = scan.nextDouble();

        sum = (raspberry+apricot+ugli);
        String print;
        if(raspberry== 0){
            print = "Apricot and Ugli";
            if(apricot== 0){
                print = "Ugli";
                if (ugli== 0){
                    print = "Nothing selected";
                }
            }
        }
        else{
            print ="Raspberry,Apricot and Ugli";
            if(apricot==0){
                print= "Raspberry and Ugli";
            }
            else{
                print = "Raspberry,Apricot and Ugli";
                if (ugli== 0){
                    print = "Raspberry and Apricot";
                }
                else{
                    print = "Rapsberry, Apricot and Ugli";
                }
            }
        }


        System.out.printf("Thank you for your order! Yor fruit salad is ready. Total weight of your salad is %.2fg \n",sum);
        System.out.printf("Ingredient(s) used are: %s \n",print);
    }
}
