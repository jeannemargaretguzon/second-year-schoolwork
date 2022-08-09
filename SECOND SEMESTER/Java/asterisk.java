public class asterisk {
    public static void main(String args[]) {
        // System.out.println('*');     // '' for character
        // System.out.println("***");    // "" for string
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println('*'); 

        int x, y;
        char z = '*';

        for (x=0; x<=3; x++) { // outer loop
            for (y=1; y<=x; y++){ // inner loop
                System.out.print(z);
            }
            System.out.println(); // forces the cursor to move to the next row when the inner loop is completed
        }

        for (x=0; x<=3; x++) { // outer loop
            for (y=4; y>x; y--){ // inner loop
                System.out.print(z);
            }
            System.out.println(); // forces the cursor to move to the next row when the inner loop is completed
        }
    }
}