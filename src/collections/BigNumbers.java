package collections;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        //int a = Integer.parseInt(sc.nextLine());
        //int b = Integer.parseInt(sc.nextLine());

        BigInteger A = new BigInteger(sc.nextLine());
        BigInteger B = new BigInteger(sc.nextLine());

        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}

