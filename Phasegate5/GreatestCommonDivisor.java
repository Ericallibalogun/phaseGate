public class GreatestCommonDivisor {
    public static void main(String... ericalli) {
        int firstNumber = 4;
        int secondNumber = 2;
        int divisor = getTheGreatestCommonDivisorBetweenNumbers(firstNumber, secondNumber);
        System.out.println("The greatest common divisor is : " + divisor);
    }

    public static int getTheGreatestCommonDivisorBetweenNumbers(int firstNumber, int secondNumber) {
        int greatestDivisor = 0;
        for (int count = 1; count <= firstNumber && count <= secondNumber; count++) {
            if (firstNumber % count == 0 && secondNumber % count == 0) {
                greatestDivisor = count;
            }
        }
        return greatestDivisor;
    }
}