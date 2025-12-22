package leetcode;


//   9. Length of Last Word

public class Length_of_Last_Word_58 {
	    public static void main(String[] args) {

	        String s = "Hello World";  

	        String[] words = s.trim().split(" ");
	        String last = words[words.length - 1];
	        int length = last.length();

	        System.out.println("Length of last word: " + length);
	    }
	}
