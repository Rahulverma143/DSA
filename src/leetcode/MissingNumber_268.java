package leetcode;

// 1. Missing Number 
public class MissingNumber_268 {

    public static void main(String[] args) {

        int[] nums = {3, 0, 1, 5, 4};  

        int n = nums.length;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int missing = total - sum;
        System.out.println("Missing Number is : " + missing);
    }
}
