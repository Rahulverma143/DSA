package leetcode;

public class Find_Minimum_in_Rotated_Sorted_Array_153 {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2}; 

        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[nums.length - 1]) {
                s = mid + 1; // Minimum is in the right half
            } else {
                e = mid;     // Minimum is in the left half including mid
            }
        }

        // Print the minimum element
        System.out.println("Minimum element: " + nums[s]);
    }
}
