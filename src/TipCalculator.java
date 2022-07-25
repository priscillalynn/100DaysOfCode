import java.util.Scanner;


        /*===========================

           DAY 1 OF 100 - UNFINISHED

         ============================*/
public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int percent;

        System.out.println("Enter the total bill: ");
        input.nextDouble();
        System.out.println("Enter the total people splitting the bill: ");
        int people = input.nextInt();
        System.out.println("Enter the tip % (10, 15, 20): ");
        percent = input.nextInt();

        do {
            if (percent == 10) {
                System.out.println("Your total + tip is ");
            } else if (percent == 15) {
                System.out.println("Your total + tip is ");
            } else if (percent == 20) {
                System.out.println("Your total + tip is ");
            } else {
                System.out.println("Invalid option. Please choose either 10%, 15% or 20%.");
                percent = input.nextInt();
            }
        }
        while(true);

    }
}
