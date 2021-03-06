package checker;/*
 * Created by: IntelliJ IDEA
 * User: Abhinandan Padmakar Pandey
 * Date: 9th January 2020
 */

public class EvenOddChecker {
    public void checkEvenOddInStringArray(String[] inputString) {
        int countEven = 0;
        int countOdd = 0;
        for (String stringDigit : inputString) {
            try {
                int integerDigit = Integer.parseInt(stringDigit);
                if (integerDigit != 0) {
                    if (integerDigit % 2 == 0) {
                        countEven++;
                    } else {
                        countOdd++;
                    }
                }
            } catch (Exception exception) {
                System.out.println("Given element must be integer, " + exception);
            }
        }
        System.out.println("Number of even and odd numbers are " + countEven + " and " + countOdd + " respectively.");
    }
}
