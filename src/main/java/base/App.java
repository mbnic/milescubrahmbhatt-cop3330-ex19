/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */
package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        float bmi = myApp.getBMI();

        myApp.determineOutput(bmi);
    }

    public void determineOutput(float bmi) {
        if (bmi >= 18.5 && bmi <= 25)
            System.out.printf("You are within the ideal weight range.");
        else if(bmi < 18.5)
            System.out.printf("You are below the ideal weight range.");
        else
            System.out.printf("You are overweight. You should see your doctor.");
    }

    public float getBMI() {
        System.out.print("What is your height in inches? ");
        float height = in.nextFloat();

        System.out.print("What is you weight in pounds? ");
        float weight = in.nextFloat();

        return (weight / (height * height)) * 703;
    }
}
