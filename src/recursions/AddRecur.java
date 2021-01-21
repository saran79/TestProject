package recursions;

import java.util.Scanner;

public class AddRecur {
     static int sum =0;
    public static void add(int a) {
        if(a>0){
            sum+=a; // sum = sum + a;
            a--; // a= a-1;
            add(a);
        }


    }

    public static void main(String[] args) {
        System.out.println("Enter the number of digits to be added from 1 :");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
         add(n);
        System.out.println(sum);
    }
}
