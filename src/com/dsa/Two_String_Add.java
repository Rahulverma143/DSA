package com.dsa;

public class Two_String_Add {

	    public static void main(String[] args) {

	        String s1 = "99";
	        String s2 = "99";

	        int i = s1.length() - 1;
	        int j = s2.length() - 1;
	        int carry = 0;

	        String res = "";

	        while (i >= 0 || j >= 0 || carry != 0) {

	            int d1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
	            int d2 = (j >= 0) ? s2.charAt(j) - '0' : 0;

	            int sum = d1 + d2 + carry;

	            int digit = sum % 10;
	            carry = sum / 10;

	            res = digit + res;

	            i--;
	            j--;
	        }

	        System.out.println(res); // 198
	    }
	}
