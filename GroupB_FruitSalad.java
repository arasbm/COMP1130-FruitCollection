/*
    Project: A Java project created for Getter and Setter methods.
    Group B.
    Group Members: Anthony, Jay, Ujjwal, Vinit.
    Date: October 16, 2021.
*/

import java.util.Scanner;


public class GroupB_FruitSalad {
    public static void main(String[] args) {
        Cherry cherry = new Cherry(); // object created for Cherry.java class.
        PineApple pineapple = new PineApple(); // object created for PineApple.java class.
        DragonFruit dragonfruit = new DragonFruit(); // object created for DragonFruit.java class.
        Apple apple = new Apple(); // object created for Apple.java class.

        Scanner scan = new Scanner(System.in); // Scanner object created.

        System.out.println("\nWelcome to Team B's Fruit Salad Maker!\n");
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

        System.out.printf("\n\nThank you for your order! Your fruit salad is ready.");
        System.out.printf("\nTotal weight of your salad is %.2fg. \nIngredients: %s", totalgrams, ingredients); // Answer printed with formatings.
        scan.close();
    }
}
