import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class GuzonJeanne2{
	public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);

		// Saleds Order Code: alphanumeric, 50 characters
        System.out.println("Sales Order Code: ");
		String salescode = scanner.nextLine();
        if (salescode.length() > 50){
            String cutName = salescode.substring(0,50);
            salescode = cutName;
        }

        // Product Code: alphanumeric, 50 characters
        System.out.println("Product No.: ");
		String productno = scanner.nextLine();
        if (productno.length() > 50){
            String cutName = salescode.substring(0,50);
            productno = cutName;
        }
        
        // Qty: Integer, 50 characters
        System.out.println("Quantity: ");
		int qty = scanner.nextInt();

        FileWriter objFile = new FileWriter("order.txt",true);
        PrintWriter saveFile = new PrintWriter(objFile);
        saveFile.write(salescode);
        saveFile.write(productno);
        saveFile.write(qty);
        saveFile.close();
        objFile.close();
		
		System.out.println("Data Stored.");
	}
}
