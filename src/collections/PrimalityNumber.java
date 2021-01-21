package collections;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityNumber {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        scanner.close();

        BigInteger a = new BigInteger(n);
        if (a.isProbablePrime(1))
            System.out.println("prime");
        else
            System.out.println("not prime");

    }
}

