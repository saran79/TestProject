package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringTokens {

        public static void main(String[] args) {
            int a[] = new int[4];
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine().trim();
              if(s.isEmpty()){
                  // Write your code here.
                  System.out.println(0);
              }
            else {
                ArrayList<String> list = new ArrayList<String>();
                String[] ss = s.trim().split("[ '?!._'@]+");
                Collections.addAll(list, ss);

                for (String token : list) {
                    System.out.println(token);
                }
                sc.close();
            }
        }
}
