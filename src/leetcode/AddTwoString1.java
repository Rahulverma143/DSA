package leetcode;

public class AddTwoString1 {

	public static void main(String[] args) {
		 String s1 = "1234";
	        String s2 = "1234";
	        int carry = 0;
	        String result = "";
	        int i = s1.length() - 1;
	        int j = s2.length() - 1;

	        while (i >= 0 || j >= 0 || carry != 0) {
	
	        int digit1 = i >= 0 ? s1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? s2.charAt(j) - '0' : 0;
            
            int sum = digit1 + digit2 + carry;
            char digitChar = (char) ((sum % 10) + '0');
            
            result = digitChar + result;
            carry  = sum/ 10;
            i--;
            j--;
	        }
	        System.out.println(result);
	}
}
