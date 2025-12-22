package leetcode;


//  3. Set Mismatch 
import java.util.Arrays;
import java.util.HashSet;

public class Set_Mismatch_645 {

	    public static void main(String[] args) {  

	        int[] nums = {1, 2, 2, 4};  
	        int[] ans = new int[2];

	        Arrays.sort(nums);
	        HashSet<Integer> set = new HashSet<>();

	        for (int i = 0; i < nums.length; i++) {
	            if (set.contains(nums[i]))
	                ans[0] = nums[i];   
	            else
	                set.add(nums[i]);
	        }

	        for (int i = 1; i <= nums.length; i++) {
	            if (!set.contains(i))
	                ans[1] = i;       	        }

	   
	        System.out.println(ans[0] + " " + ans[1]);
	    }
	}
