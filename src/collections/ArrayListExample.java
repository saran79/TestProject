package collections;
import java.io.*;
import java.util.*;

public class ArrayListExample {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        int number[];
        Scanner sc = new Scanner(System.in);

        // input list
        int noOfLines = Integer.parseInt(sc.nextLine());
        ArrayList<int[]> arr = new ArrayList<int[]>();
        for (int i = 0; i < noOfLines; i++) {
            n = sc.nextInt();
            number = new int[n];
            for (int j = 0; j < n; j++) {
                number[j] = sc.nextInt();
            }
            arr.add(number);
            sc.nextLine();
        }

        // print the arrayList that contains the input
        for (int[] s : arr)
            System.out.println(Arrays.toString(s));

        // input queries list
        int noOfQueries = Integer.parseInt(sc.nextLine());
        ArrayList<int[]> arr1 = new ArrayList<int[]>();
        for (int i = 0; i < noOfQueries; i++) {
            number = new int[2];
            for (int j = 0; j < 2; j++) {
                number[j] = sc.nextInt();
            }
            arr1.add(number);
            sc.nextLine();
        }
        // print the arrayList that contains the queries
        for (int[] s : arr1)
            System.out.println(Arrays.toString(s));
        int n1[];
        int n2[];
        for(int i =0; i<noOfQueries;i++){
            n2= arr1.get(i);
            n1 = arr.get(n2[0]-1);
            if(n2[1]>n1.length)
                System.out.println("ERROR");
            else
                System.out.println(n1[n2[1]-1]);
        }
    }


}
