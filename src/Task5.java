//Fahrenheit to Celsius converter

import java.util.Scanner;

public class Task5 {
    static void main() {

        //declaring variables
        Scanner scan = new Scanner(System.in);
        double tempF;
        double tempC;

        //input collection, output calculation, and printing
        System.out.println("Input a temperature in degrees Fahrenheit (no units).");
        tempF = scan.nextDouble();
        tempC = (tempF - 32) * 5 / 9;
        System.out.println(tempF + " degrees Fahrenheit converts to " + tempC + " degrees Celsius.");
    }
}
