import java.util.Scanner;

public class IT21112164Lab5Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        int smallest = num1;
        int largest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

	System.out.println();
	System.out.println("User entered numbers are: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        input.close();
    }
}