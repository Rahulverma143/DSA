package leetcode;


//   10, Find the Index of the First Occurrence in a String
public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {

	    public static void main(String[] args) {

	        String haystack = "hello";  
	        String needle = "ll";

	        int n = haystack.length();
	        int m = needle.length();

	        int result = -1;

	        for (int i = 0; i <= n - m; i++) {
	            int j;
	            for (j = 0; j < m; j++) {
	                if (haystack.charAt(i + j) != needle.charAt(j)) {
	                    break;
	                }
	            }
	            if (j == m) {
	                result = i;
	                break;
	            }
	        }

	        System.out.println("Index: " + result);
	    }
	}
