//Date; 19/09/2025
//Author: Harriet Yayra Boven Fiahagbe
//Description: Creat a short Java Program that helps coach to make decisions about a player based on certain factors and statistics

//TASK 1
//importing Scanner package to allow input
import java.util.Scanner;
public class FootballPlayer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//declaring variables with their approiate data type and accpeting data from user
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();


        System.out.print("Enter your height: ");
        double height = input.nextDouble();

        System.out.print("Enter your weight: ");
        double weight = input.nextDouble();


        System.out.print("Enter your jersey number: ");
        int jersey_number = input.nextInt();
/*
        System.out.println("Name -  " + name);
        System.out.println("Age -  " + age);
        System.out.println("Height -  " + height + " m");
        System.out.println("Weight -  " + weight + " erlbs");
        System.out.println("Jersey Number -  " + jersey_number);

 */


//TASK 2
        //declaring constant variabels
        float POUND = 0.45359237f;
        int METER = 100;
        //Converting from cm to meter and kg to pounds
        double new_weight = POUND * weight;
        double new_height = height * METER;
        int current_height = (int) new_height;
        int current_weight = (int) new_weight;

        System.out.println("Name -  " + name);
        System.out.println("Age -  " + age);
        System.out.println("Height -  " + current_height + " cm");
        System.out.println("Weight -  " + current_weight + " kg");
        System.out.println("Jersey Number -  " + jersey_number);


        //TASK 3

System.out.println(age);
age++;
jersey_number--;
System.out.println("Age - " + age);
System.out.println("Jersey number - " + jersey_number);

//TASK 4
//EXPERIMENT 1
        boolean Eligible = (age >= 18) && (age < 35) && (current_weight <90);
        if (Eligible){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");

        }

        //EXPERIMENT 2
        boolean problem = (age<18) || (current_weight >= 90);
        if (problem) {
            System.out.println("Player has a problem(Either too young or too heavy)");
        }

        //EXPERIMENT 3
        boolean notEligible = (!Eligible);
        if (notEligible){
            System.out.println("Not Eligible");

        }
//TASK 5
        String player_type;
        if (age<20){
            player_type = "Rising Star";
            //System.out.println("Rising Star");
        }
        else if (age>= 20 && age<30) {
            player_type = "Prime Player";
            //System.out.println("Prime Player");
        }else{
            player_type = "Vetran";
            //System.out.println("Vetran");
        }

 //TASK 6
System.out.println("Enter the jersey number of the player: ");

        String player_position= "";
        switch(jersey_number){

            case 1: player_position = "Goal kepper";
            break;

            case 2:
            case 5:player_position = "Defender";
            break;

            case 6:
            case 8:player_position = "midfielder";
                break;

            case 7: player_position= "Winger";
            break;

            case 9: player_position = "Striker";
            break;

            case 10:player_position = "Play Maker";
            break;



            default:
                System.out.println("player position not known");




        }
        System.out.println("Your player is a " + player_position);

//TASK 7
        //I AM DONE WITH YOU AS WELL, DID IT IN TASK 6


//TASK 8
       String linup_final;
if (player_type.equals("Prime Player")){
    if (current_weight < 80) {
        linup_final = "Lineup";
    }else{
        linup_final = "Bench";
    }

//TASK 9

    }
}





    }
}



