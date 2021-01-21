package recursions;

import java.util.Scanner;


public class LoopsToRecursion {

    public static int recur(int i){
       if(i<=0)
           return 0;
        System.out.println( i );
        return recur(i-1);

    }

    // for(int i=10; i>0;i++)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines to be printed");
         int in = sc.nextInt();
         recur(in);
    }
}
