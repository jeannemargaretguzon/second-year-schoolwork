

import java.util.ArrayList;
import java.util.List;

public class hightolow {
    static int x, y; // counter for loop
    static int temp; // temporary holder for the value in the list
    
    public static void main(String args[]) {
        int [] s1 = {33, 2, 70, 4, 52, 42, 8, 35, 9, 211};
        sortEvenOdd(s1);
        displayhighest(s1);
        displaylowest(s1);
        sorthightolow(s1);
    }

    /* Display the highest number without sorting */
    private static void displayhighest(int[] s1) {
        for (x=0; x<s1.length; x++){
            if (s1[x] > temp){
                // int index = x;
                temp = s1[x];
            }   
        }
        System.out.println("\nThe highest value is " + temp);
    }

    /* Display the lowest number without sorting */
    private static void displaylowest(int[] s1) {
        for (x=0; x<s1.length; x++){
            if (s1[x] < temp){
                // int index = x;
                temp = s1[x];
            }   
        }
        System.out.println("\nThe lowest value is " + temp);
    }
    
    /* Sort the array into an ascending order */
    private static void sorthightolow(int[] s1) {
        for (x=0; x<s1.length; x++){
            for (y=x + 1; y<s1.length;y++){
                if (s1[x] > s1[y]){
                    temp = s1[x];
                    s1[x] = s1[y];
                    s1[y] = temp;
                }
            }   
        }

        System.out.println("\nArray in Ascending Order");
        for (x=0; x<s1.length; x++){
            System.out.println(s1[x]);
        }
    }    

    /* Separate odd and even numbers */
    private static void sortEvenOdd(int[] s1) {

        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();

        for (x=0; x<s1.length; x++){
            temp = s1[x];
            
            if (temp%2 == 0){
                odd.add(temp);   
            }
            else if (temp%2 != 0){
                even.add(temp);   
            }
        }

        // print odd
        System.out.println("\nOdd Numbers");
        for (x=0; x!=odd.size(); x++){
            System.out.println(odd.get(x));
        }

        // print even
        System.out.println("\nEven Numbers");
        for (x=0; x!=even.size(); x++){
            System.out.println(even.get(x));
        }
    }


}
