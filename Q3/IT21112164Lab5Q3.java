import java.util.Scanner;

public class IT21112164Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter Start Date (1-31): ");
        int startDay = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDay = input.nextInt();

        // Validation 1
        if (startDay < 1 || startDay > 31 ||
            endDay < 1 || endDay > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            input.close();
            return;
        }

        // Validation 2
        if (startDay >= endDay) {
            System.out.println("Error: Start Date must be less than the End Date");
            input.close();
            return;
        }

        int numberOfDays = endDay - startDay;

        double discountRate = 0.0;

        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discountRate = DISCOUNT_10;
        } 
        else if (numberOfDays >= 5) {
            discountRate = DISCOUNT_20;
        }

        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalAmount * discountRate;
        double amountToPay = totalAmount - discountAmount;

        System.out.println("\nNumber of Days Reserved: " + numberOfDays);
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);
        System.out.println("Total Amount to be Paid: Rs. " + amountToPay);

        input.close();
    }
}