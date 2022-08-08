import java.util.Scanner;

public class hourtominute {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); // used for user input
        
        System.out.println("Minutes you worked: ");
        int minute = scanner.nextInt();

        /*Convert minutes to hours */
        int hour = minute/60;
        int remain_minute = (minute%60)*60;        

        System.out.println(hour + " hours " + remain_minute + " minutes ");
        
        scanner.close(); // closing the scanner to avoid memory wastage
    }
}
