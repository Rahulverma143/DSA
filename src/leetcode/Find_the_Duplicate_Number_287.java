package leetcode;

public class Find_the_Duplicate_Number_287 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        int[] freq = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int duplicate = -1;
        for (int i = 1; i < freq.length; i++) { // Start from 1
            if (freq[i] > 1) {
                duplicate = i;
                break;
            }
        }

       
        System.out.println("Duplicate number: " + duplicate);
    }
}
