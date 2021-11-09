/*
    Project: A Java project created for Getter and Setter methods.
    Group B.
    Group Members: Anthony, Jay, Ujjwal, Vinit.
    Date: October 16, 2021.
    This program was modified using loops and enum class.
*/

import java.util.Scanner;

// enum class created by Anthony
enum Toppings {
    WHIPPED_CREAM, 
    CHOCOLATE, 
    LEMON_JUICE
}

public class GroupB_FruitSalad {
    public static void main(String[] args) {
        Cherry cherry = new Cherry(); // object created for Cherry.java class.
        PineApple pineapple = new PineApple(); // object created for PineApple.java class.
        DragonFruit dragonfruit = new DragonFruit(); // object created for DragonFruit.java class.
        Apple apple = new Apple(); // object created for Apple.java class.

        Scanner scan = new Scanner(System.in); // Scanner object created.
        
        String console;
        int count = 0;

        do{

        System.out.println("\n-------- Welcome to Team B's Fruit Salad Maker! --------\n");
        System.out.println("Please enter how many grams of Cherry your want in your salad: ");
        cherry.setGrams(scan.nextDouble());
        System.out.println("Please enter how many grams of PineApple your want in your salad: ");
        pineapple.setWeight(scan.nextDouble());
        System.out.println("Please enter how many grams of DragonFruit your want in your salad: ");
        dragonfruit.setWeight(scan.nextDouble());
        System.out.println("Please enter how many grams of Apple your want in your salad: ");
        apple.setWeight(scan.nextDouble());

        double totalgrams = cherry.getGrams() + pineapple.getWeight() + dragonfruit.getWeight() + apple.getWeight(); // Total salad grams calculated.
        String ingredients = "";
        Integer toppings = 0;

        System.out.println("\n\n-------- Choose Your Toppings --------");
        System.out.print("\nPress 1. WHIPPED_CREAM | 2. CHOCHOLATE | 3. LEMON_JUICE : ");
        toppings = scan.nextInt();


        /* Nested if else statements. */
       if(pineapple.getWeight() > 0 && cherry.getGrams() > 0 && dragonfruit.getWeight() > 0 && apple.getWeight() == 0){                         
            ingredients = "Cherry, PineApple, DragonFruit.\n";
        }

        else if(pineapple.getWeight() > 0 && cherry.getGrams() > 0 && dragonfruit.getWeight() == 0 && apple.getWeight() > 0){                         
            ingredients = "Cherry, PineApple, Apple.\n";
        }

        else if(pineapple.getWeight() > 0 && cherry.getGrams() == 0 && dragonfruit.getWeight() > 0 && apple.getWeight() > 0){                         
            ingredients = "PineApple, DragonFruit, Apple.\n";
        }

        else if(pineapple.getWeight() == 0 && cherry.getGrams() > 0 && dragonfruit.getWeight() > 0 && apple.getWeight() > 0){                         
            ingredients = "Cherry, DragonFruit, Apple.\n";
        }

        else if(pineapple.getWeight() > 0 && cherry.getGrams() > 0 && dragonfruit.getWeight() == 0 && apple.getWeight() == 0){                         
            ingredients = "Cherry, PineApple.\n";
        }

        else if(pineapple.getWeight() > 0 && cherry.getGrams() == 0 && dragonfruit.getWeight() > 0 && apple.getWeight() == 0){                         
            ingredients = "PineApple, DragonFruit.\n";
        }

        else if(pineapple.getWeight() == 0 && cherry.getGrams() > 0 && dragonfruit.getWeight() == 0 && apple.getWeight() > 0){                         
            ingredients = "Cherry, Apple.\n";
        }

        else if(pineapple.getWeight() > 0 && cherry.getGrams() == 0 && dragonfruit.getWeight() == 0 && apple.getWeight() > 0){                         
            ingredients = "PineApple, Apple.\n";
        }

        else if(pineapple.getWeight() == 0 && cherry.getGrams() > 0 && dragonfruit.getWeight() > 0 && apple.getWeight() == 0){                         
            ingredients = "Cherry, DragonFruit.\n";
        }

        else if(pineapple.getWeight() == 0 && cherry.getGrams() == 0 && dragonfruit.getWeight() > 0 && apple.getWeight() > 0){                         
            ingredients = "DragonFruit, Apple.\n";
        }

        else if(pineapple.getWeight() > 0){                         
            if(cherry.getGrams() > 0){
                if(dragonfruit.getWeight() > 0){
                    if(apple.getWeight() > 0){
                        ingredients = "Cherry, PineApple, DragonFruit, Apple.\n";
                    }
                }
            }
        }

        else if(pineapple.getWeight() <= 0){                                                                   
            if(cherry.getGrams() <= 0){
                if(dragonfruit.getWeight() <= 0){
                    if(apple.getWeight() <= 0){
                        ingredients = "Nothing Selected :(\n";
                    }
                }
            }
        }

        System.out.println("\n\n-------- Your Order Details --------");
        System.out.printf("\n\nThank you for your order! Your fruit salad is ready.");
        System.out.printf("\nTotal weight of your salad is %.2fg. \nIngredients: %s", totalgrams, ingredients); // Answer printed with formatings.
            
        // enum toppings used by Vinit    
        if(toppings == 1) {System.out.println("Your Toppings: " + Toppings.WHIPPED_CREAM);} 
        else if(toppings == 2) {System.out.println("Your Toppings: " + Toppings.CHOCOLATE);}
        else if(toppings == 3) {System.out.println("Your Toppings: " + Toppings.LEMON_JUICE); }
        else {System.out.println("Toppings: " + "Huh! No Toppings Selected :(");}

        System.out.println("\n\nDo You Want Contiue?");
        System.out.print("Press 'Yes' to Coninue | 'No' to End: ");
        console = scan.next();

        count++; 
        
        
    }
    while(console.equals("Yes") || console.equals("yes") || console.equals("YES")); // do while loop created by Jay and Ujjwal

    System.out.println("\nTotal Salad Dish: " + count + "\n");
    scan.close();
    }
}
