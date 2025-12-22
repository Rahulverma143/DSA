package leetcode;

//   5.  Find All Duplicates in an Array 

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array_442 {

	    public static void main(String[] args) {

	        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

	        List<Integer> ll = new ArrayList<>();

	        for (int i = 0; i < nums.length; i++) {
	            int pos = Math.abs(nums[i]) - 1;

	            if (nums[pos] < 0) {
	                ll.add(Math.abs(nums[i]));   // duplicate
	            } else {
	                nums[pos] = -nums[pos];
	            }
	        }

	        System.out.println(ll);
	    }
	}
