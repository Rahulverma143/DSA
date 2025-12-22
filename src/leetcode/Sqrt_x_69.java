package leetcode;

//   7.  Sqrt(x)

public class Sqrt_x_69 {

	    public static void main(String[] args) {

	        int x = 8;   

	        long start = 0;
	        long end = x;
	        int ans = 0;

	        while (start <= end) {
	            long mid = start + (end - start) / 2;

	            if (mid * mid <= x) {
	                ans = (int) mid;
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }

	        System.out.println("Square root is: " + ans);
	    }
	}
