package General;

import java.util.Arrays;

public class MainOverload {
    public static void main(String[] args) {
        System.out.println("hello");
        int a[] = {1,2,3,4,5};
        int b[] = {6,7,8,9,10};

        main( a,b);
    }

    public static void main(int[] a, int[] b) {
        for(int i =0;i< b.length;i++)
        System.out.println(a[i] + " " + b[i]);

    }
}
