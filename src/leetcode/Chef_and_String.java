package leetcode;

import java.util.Scanner;

public class Chef_and_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // Read number of test cases

        while (t-- > 0) {
            String s = sc.nextLine(); // Read the whole line for the string
            int c = 0;

            for (int i = 1; i < s.length(); i++) { // start from i = 1
                if ((s.charAt(i) == 'x' && s.charAt(i - 1) == 'y') ||
                    (s.charAt(i) == 'y' && s.charAt(i - 1) == 'x')) {
                    c++;
                    i++; // Skip next character to avoid overlap
                }
            }

            System.out.println(c);
        }

//        sc.close();
    }
}
