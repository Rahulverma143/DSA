package com.dsa;

import java.util.Stack;

public class Demo {

 public static void main(String[] args) {
	    int nums []= { 5, 2,4,1,6};
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
                int ind = st.pop();
                ans[ind] = nums[i];  
            } 
            st.push(i);
        }

    }
}
