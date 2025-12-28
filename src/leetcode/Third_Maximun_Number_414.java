package leetcode;

//  2. Third Maximun Number 
public class Third_Maximun_Number_414 {
    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 1};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int uniqueCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (num == firstMax || num == secondMax || num == thirdMax)
                continue;

            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
                uniqueCount++;
            }
            else if (num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
                uniqueCount++;
            }
            else if (num > thirdMax) {
                thirdMax = num;
                uniqueCount++;
            }
        }

        int result;
        if (uniqueCount < 3) {
            result = firstMax;
        } else {
            result = thirdMax;
        }

        System.out.println("Third maximum number is: " + result);
    }
}


//package leetcode;
//
//public class Third_Maximun_Number_414 {
//
//    public static void main(String[] args) {
//
//        int[] nums = {2, 2, 3, 1};
//
//        int firstMax = Integer.MIN_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//        int thirdMax = Integer.MIN_VALUE;
//
//        int uniqueCount = 0;
//        for (int num : nums) {
//            if (num == firstMax || num == secondMax || num == thirdMax)
//                continue;
//
//            if (num > firstMax) {
//                thirdMax = secondMax;
//                secondMax = firstMax;
//                firstMax = num;
//                uniqueCount++;
//            } 
//            else if (num > secondMax) {
//                thirdMax = secondMax;
//                secondMax = num;
//                uniqueCount++;
//            } 
//            else if (num > thirdMax) {
//                thirdMax = num;
//                uniqueCount++;
//            }
//        }
//
//        int result;
//        if (uniqueCount < 3) {
//            result = firstMax;
//        } else {
//            result = thirdMax;
//        }
//
//        System.out.println(result);
//    }
//}
