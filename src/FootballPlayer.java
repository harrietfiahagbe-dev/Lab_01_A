//Date; 19/09/2025
//Author: Harriet Yayra Boven Fiahagbe
//Description: Creat a short Java Program that helps coach to make decisions about a player based on certain factors and statistics


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

        System.out.println("Name -  " + name);
        System.out.println("Age -  " + age);
        System.out.println("Height -  " + height + "m");
        System.out.println("Weight -  " + weight + "lbs");
        System.out.println("Jersey Number -  " + jersey_number);






    }
}
