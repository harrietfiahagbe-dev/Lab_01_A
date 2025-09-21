//Date; 19/09/2025
//Author: Harriet Yayra Boven Fiahagbe
//Description: Creat a short Java Program that helps coach to make decisions about a player based on certain factors and statistics

//TASK 1
import java.util.Scanner;
public class FootballPlayer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
        float POUND = 0.45359237f;
        int METER = 100;
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




    }
}



