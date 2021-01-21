package patterns;

import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of lines to construct a Square");
        int n = sc.nextInt();
        int count = 0;
        for(int i =0;i<n;i++){
            while(count<n) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            count =0;
        }
    }
}


