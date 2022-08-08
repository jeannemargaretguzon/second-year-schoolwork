import java.util.Scanner;

public class cashconvert {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in); // used for user input

        // counters
        int thousand = 0;
        int fivehundred = 0;
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int one = 0;

        System.out.println("Cash Denomination: ");
        Double cash = scanner.nextDouble();

        while(cash !=0){
            if (cash > 1000){
                cash = cash - 1000;
                thousand++;
            }
            else if (cash > 500){
                cash = cash - 500;
                fivehundred++;
            }
            else if (cash > 100){
                cash = cash - 100;
                hundred++;
            }
            else if (cash > 50){
                cash = cash - 50;
                fifty++;
            }
            else if (cash > 20){
                cash = cash - 20;
                twenty++;
            }
            else if (cash > 10){
                cash = cash - 10;
                ten++;
            }
            else if (cash > 5){
                cash = cash - 5;
                five++;
            }
            else if (cash < 5){
                cash = cash - 1;
                one++;
            }
            else{
                break;
            }
        }
        
        System.out.println("Cash: " + cash);
        System.out.println("Denominations: ");
        System.out.println("1000 - " + thousand);
        System.out.println("500 - " + fivehundred);
        System.out.println("100 - " + hundred);
        System.out.println("50 - " + fifty);
        System.out.println("20 - " + twenty);
        System.out.println("10 - " + ten);
        System.out.println("5 - " + five);
        System.out.println("1 - " + one);

        scanner.close(); // closing the scanner to avoid memory wastage
    }
}
