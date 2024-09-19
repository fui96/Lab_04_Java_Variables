//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // Variable Declaration
        int intOperandA = 22;
        int intOperandB = 17;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;
        double DoubleOperandA = 1.7;
        double DoubleOperandB = 4.5;
        double DoubleSum;
        double DoubleProduct;
        double DoubleDifference;
        double DoubleQuotient;
        // End Declaration

        intSum = intOperandA + intOperandB;
        System.out.println(intSum + " is the sum of " + intOperandA + " and " + intOperandB);
        intProduct = intOperandA * intOperandB;
        System.out.println(intProduct + " is the product of multiplying " + intOperandA + " by " + intOperandB);
        intDifference = intOperandA - intOperandB;
        System.out.println(intDifference + " is the difference of " + intOperandA + " and " + intOperandB);
        intQuotient = intOperandA / intOperandB;
        System.out.println(intQuotient + " is the quotient of " + intOperandA + " and " + intOperandB);
        intModulo = intOperandA % intOperandB;
        System.out.println(intModulo + " is the remainder of " + intOperandA + " and " + intOperandB);
        DoubleSum = DoubleOperandA + DoubleOperandB;
        System.out.println(DoubleSum + " is the sum of " + DoubleOperandA + " and " + DoubleOperandB);
        DoubleProduct = DoubleOperandA * DoubleOperandB;
        System.out.println(DoubleProduct + " is the product of " + DoubleOperandA + " and " + DoubleOperandB);
        DoubleDifference = DoubleOperandA - DoubleOperandB;
        System.out.println(DoubleDifference + " is the difference of " + DoubleOperandA + " and " + DoubleOperandB);
        DoubleQuotient = DoubleOperandA / DoubleOperandB;
        System.out.println(DoubleQuotient + " is the quotient of " + DoubleOperandA + " and " + DoubleOperandB);
    }
}
