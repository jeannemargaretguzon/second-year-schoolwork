import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class GuzonJeanne1{
	public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
		
        // Product Code: alphanumeric, 50 characters
        System.out.println("Product Code: ");
		String code = scanner.nextLine();
        if (code.length() > 50){
            String cutName = code.substring(0,50);
            code = cutName;
        }

        // Description: alphanumeric, 100 characters
        System.out.println("Description: ");
		String description = scanner.nextLine();
        if (description.length() > 100){
            String cutName = code.substring(0,100);
            description = cutName;
        }

        // Part No.: alphanumeric, 50 characters
        System.out.println("Part No.: ");
		String partno = scanner.nextLine();
        if (partno.length() > 50){
            String cutName = code.substring(0,50);
            partno = cutName;
        }

        // Price: float
        System.out.println("Price: ");
		float price = scanner.nextFloat();

        // SAVING FILE
        FileWriter objFile = new FileWriter("product.txt",true);
        PrintWriter saveFile = new PrintWriter(objFile);

        //saveFile.write(" Product Code: "+code);
        //saveFile.write(" Description: "+description);
        //saveFile.write(" Part No.: "+partno);
        //saveFile.write(" Price: "+price);

        saveFile.println(code);
        saveFile.println(description);
        saveFile.println(partno);
        saveFile.println(price);
        saveFile.close();
        objFile.close();
		
		System.out.println("Data Stored.");
	}
}
