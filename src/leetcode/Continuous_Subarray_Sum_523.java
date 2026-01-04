package leetcode;

public class Continuous_Subarray_Sum_523 {

    public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;

        boolean found = false;
        for (int start = 0; start < nums.length - 1; start++) {
            int sum = nums[start];
            for (int end = start + 1; end < nums.length; end++) {
                sum += nums[end];

                if (k != 0) {
                    if (sum % k == 0) {
                        found = true;
                        break; 
                    }
                } else { 
                    if (sum == 0) {
                        found = true;
                        break;
                    }
                }
            }
            if (found) break; 
        }

        // Print the result
        if (found) {
            System.out.println("Continuous subarray sum that is a multiple of " + k);
        } else {
            System.out.println("No such subarray exists.");
        }
    }
}
