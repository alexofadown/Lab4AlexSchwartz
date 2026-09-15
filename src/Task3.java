//Yearly Maintenance Cost
import java.util.Scanner;
public class Task3 {
    static void main() {

        //declaring variables
        Scanner scan = new Scanner(System.in);
        double winterMaintenance;
        double springMaintenance;
        double summerMaintenance;
        double autumnMaintenance;
        double yearlyMaintenance;
        //"autumn" instead of "fall" to make them all the same character length (if you're wondering why)

        //taking values for each season
        System.out.println("Input maintenance costs for each season below.");

        System.out.println("Winter maintenance cost:");
        winterMaintenance = scan.nextDouble();
        System.out.println("Spring maintenance cost:");
        springMaintenance = scan.nextDouble();
        System.out.println("Summer maintenance cost:");
        summerMaintenance = scan.nextDouble();
        System.out.println("Autumn maintenance cost:");
        autumnMaintenance = scan.nextDouble();

        //calculating, outputting, and explaining final cost
        yearlyMaintenance = winterMaintenance + springMaintenance + summerMaintenance + autumnMaintenance;
        System.out.println("Your yearly maintenance cost is $" + yearlyMaintenance + ". The yearly cost is the costs from all the seasons, added up.");

    }
}
