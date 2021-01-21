package collections;

import java.util.Scanner;

public class StringComparisons {

        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";
            java.util.ArrayList<String> list = new java.util.ArrayList<String>();

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

            for (int i = 0; i<s.length();i++){
                if(i==s.length()-(k-1)){
                    break;
                }
                else
                    list.add(s.substring(i,i+k));
            }
            java.util.Collections.sort(list);
            smallest=list.get(0);
            largest = list.get(list.size()-1);
            return smallest + "\n" + largest;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
    }

