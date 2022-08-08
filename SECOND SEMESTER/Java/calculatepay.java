import java.util.Scanner;

public class calculatepay {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in); // used for user input
        
        System.out.println("Hourly rate: ");
        Double hourly_rate = scanner.nextDouble();
        
        System.out.println("Hours worked: ");
        Double hour_worked = scanner.nextDouble();
        
        /* CALCULATING FOR THE GROSS PAY */
        Double gross_pay = hourly_rate * hour_worked;
        System.out.println("Gross pay: " + String.format("%,.2f", gross_pay));
        
        /* CALCULATING FOR THE TAX */
        Double withholding_tax = gross_pay * 0.15;
        System.out.println("Witholding tax: " + String.format("%,.2f", withholding_tax));
        
        /* CALCULATING FOR THE NET PAY */
        Double net_pay = gross_pay - withholding_tax;
        System.out.println("Net Pay: " + String.format("%,.2f", net_pay));

        scanner.close(); // closing the scanner to avoid memory wastage
         
    }
}
