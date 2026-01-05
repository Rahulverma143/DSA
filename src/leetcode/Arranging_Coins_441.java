package leetcode;

public class Arranging_Coins_441 {

    public static void main(String[] args) {
        long n = 8; 

        long start = 0;
        long end = n;
        long ans = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sum = mid * (mid + 1) / 2; 

            if (sum <= n) {
                ans = mid;      
                start = mid + 1; 
            } else {
                end = mid - 1;   
            }
        }

        System.out.println("Maximum complete rows: " + ans);
    }
}
