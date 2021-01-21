package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try{
        int x = Integer.parseInt(sc.nextLine());

        int y = Integer.parseInt(sc.nextLine());
        if ((x > 0 &&  x < Integer.MAX_VALUE) && (y >0 && y < Integer.MAX_VALUE))
                System.out.println(x / y);
        } catch( InputMismatchException e) {
            System.out.println(e);
        } catch(ArithmeticException a){

            System.out.println(a);
        }
    }
}
