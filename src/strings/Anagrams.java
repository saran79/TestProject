package strings;

import java.util.Scanner;

public class Anagrams {

        static boolean isAnagram(String a, String b) {
            // Complete the function
            java.util.HashMap<Character, Integer> charCountMap
                    = new java.util.HashMap<Character, Integer>();
            java.util.HashMap<Character, Integer> charCountMap1
                    = new java.util.HashMap<Character, Integer>();
            char[] strArray = a.toCharArray();
            for (char c : strArray) {
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
            strArray = b.toCharArray();
            for (char c : strArray) {
                if (charCountMap1.containsKey(c)) {
                    charCountMap1.put(c, charCountMap1.get(c) + 1);
                } else {
                    charCountMap1.put(c, 1);
                }
            }
            if(charCountMap.equals(charCountMap1))
                return true;
            else
                return false;

        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }

