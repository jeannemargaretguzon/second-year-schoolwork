public class printVar {
    

    public static void main(String args[]) {
        String Sagot = "true";
        int A = 2;
        int B = 4;
        char Letter = 'c';
        double Pi = 3.14;

        System.out.println("The value of A is " + A + "while B is " + B);
        System.out.println("Letter" + Letter);
        System.out.println("Initial value of Sagot is " + Sagot);
        System.out.println("Pi contains the value of " + Pi);
        
        Sagot = "false"; // changing the value
        System.out.println("Sagot is now " + Sagot);
    }
}
