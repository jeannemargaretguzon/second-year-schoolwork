public class onetofive {
    public static void main(String args[]) {
        // System.out.println('1');     // '' for character
        // System.out.println("12");    // "" for string
        // System.out.println("123");
        // System.out.println("1234");
        // System.out.println("12345");

        int x, y;

        for (x=0; x<=3; x++) { // outer loop
            for (y=1; y<=x; y++){ // inner loop
                System.out.print(y);
            }
            System.out.println(); // forces the cursor to move to the next row when the inner loop is completed
        }

        /*  x     y
            0  <  1    1
            1  <  2    1 2
            2  <  3    1 2 3
            3  <  4    1 2 3 4
            4 -----------
            // terminates the program because it's x = 4

         */

    }
}