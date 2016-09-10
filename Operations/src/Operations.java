import java.util.Scanner;

public class Operations {

    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        float num1;
        float num2;
       
        System.out.print ("Enter the first number:");
        num1 = input.nextFloat();
       
        System.out.print ("Enter the second number:");
        num2 = input.nextFloat();
       
        System.out.printf ("\n%.2f + %.2f =%.2f \n", num1, num2, num1 + num2);
        System.out.printf ("%.2f - %.2f = %.2f \n", num1, num2, num1 - num2);
        System.out.printf ("%.2f * %.2f = %.2f \n", num1, num2, num1 * num2);
        System.out.printf ("%.2f / %.2f = %.2f \n", num1, num2, num1 / num2);
       
       
    }
}