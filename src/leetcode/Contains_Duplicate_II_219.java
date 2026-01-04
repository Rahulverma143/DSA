package leetcode;

import java.util.HashSet;

public class Contains_Duplicate_II_219 {


	    public static void main(String[] args) {

	        int[] nums = {1, 2, 3, 1};
	        int k = 3;

	        HashSet<Integer> set = new HashSet<>();

	        boolean found = false;

	        for (int i = 0; i < nums.length; i++) {

	            if (set.contains(nums[i])) {
	                found = true;
	                break;
	            }

	            set.add(nums[i]);

	            if (set.size() > k) {
	                set.remove(nums[i - k]);
	            }
	        }

	        System.out.println(found);
	    }
	}
