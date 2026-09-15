//Monthly Credit Card Balance
import java.util.Scanner;
public class Task4 {
    static void main() {

        //declaring variables
        Scanner scan = new Scanner(System.in);
        double initialCardBalance = 5000;
        double interestRate = 0.17;
        double oneMonthBalance;
        double twoMonthBalance;

        //output calculation and printing
        oneMonthBalance = (initialCardBalance * interestRate) + initialCardBalance;
        twoMonthBalance = (oneMonthBalance * interestRate) + oneMonthBalance;
        System.out.println("Your balance after one month after starting at $5000 is $" + oneMonthBalance + ".");
        System.out.println("Your balance after two months after starting at $5000 is $" + twoMonthBalance + ".");
        System.out.println("The interest rate was 17%.");
    }
}
