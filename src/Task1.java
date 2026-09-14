public class Task1 {
    public static void main (String[] args) {

        // Making Variables

        // int variables
        int intOperandA = 6;
        int intOperandB = 7;
        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;

        // double variables
        double doubleOperandA = 6.7;
        double doubleOperandB = 67.17;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

        // calculations + printing them for ints
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        //divider lines
        System.out.println("--------------------------------------------------");
        System.out.println("Now time for the doubles!");
        System.out.println("--------------------------------------------------");

        // calculations + printing them for doubles
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}