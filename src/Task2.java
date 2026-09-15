//Shipping Cost Calculator

import java.util.Scanner;
//Note: I copied this over from the task from earlier this week (or whenever it was) that we had to do

public class Task2 {
    static void main(String[] args){
        // Variables
        Scanner scan = new Scanner(System.in);
        double nextPrice = 0;
        double totalPrice = 0;
        double finalCost;
        double taxRate = 0.05;

        //Loop to add up all the prices
        while (nextPrice != -1) {
            System.out.println("Enter the price of the next item. Enter -1 as a price to STOP.");
            nextPrice = scan.nextDouble();
            if (nextPrice == -1) {
            }
            else if (nextPrice <= 0) {
                System.out.println("You entered a negative value (other than -1). Try again.");
            }
            else {
                totalPrice += nextPrice;
            }
        }
        //Calculating final cost
            finalCost = (totalPrice * taxRate) + totalPrice;
            System.out.println("Your total cost is: $" + finalCost);
    }
}

