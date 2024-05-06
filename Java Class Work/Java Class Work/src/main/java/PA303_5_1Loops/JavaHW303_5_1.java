package PA303_5_1Loops;
import java.util.Scanner;
public  class JavaHW303_5_1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        multiTable();
        greatCD();
        futTution();
    }

    //region -Write a program that uses nested for loops to print a multiplication table.
    public static void multiTable() {
        int multi = 0;
        for (int j = 1; j <= 15; j++) {
            for (int counting = 0; counting <= 17; counting++) {
                System.out.println(multi + "X" + counting + " = " + multi * counting);
            }
            multi++;
        }
    }
    //endregion

    //region -Write a program that prompts the user to enter two positive integers,
    // and find their greatest common divisor (GCD).
    //Examples:
    //Enter 2 and 4. The gcd is 2.
    //Enter 16 and 24.  The gcd is 8.
    //How do you find the gcd?
    public static void greatCD() {

        System.out.println("Enter 1st number:");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int n2 = scanner.nextInt();

        int smallest = Math.min(n1, n2);
        int large = Math.max(n1, n2);
        if (large % smallest == 0) {
            System.out.println("GCD is " + smallest);
            return;
        }

        while (large % smallest != 0) {
            int remainder = large % smallest;
            large = smallest;
            smallest = remainder;
        }
        System.out.println("GCD is " + smallest);
    }
    //endregion

    //region -Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent
// every year. In how many years will the tuition be doubled?

    public static void futTution() {

        System.out.println("Enter tuition:");
        double staringAmt = scanner.nextDouble();
        System.out.println("Enter percentage as a whole number:");
        double rate = scanner.nextInt();
        scanner.close();
        double goalAmt = staringAmt + staringAmt;
        int yearNeeded = 0;

        while (staringAmt <= goalAmt) {
            yearNeeded++;
            staringAmt += staringAmt * rate / 350;


        }

        System.out.println("Increasing at a rate of " + rate + "% per year, It will be " + yearNeeded + " years before tuition doubles.");
    }

    //endregion
}