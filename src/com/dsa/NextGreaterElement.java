package com.dsa;

public class NextGreaterElement {

	public static void main(String[] args) {
     int arr [] = {3,2,1,5,7,9,6,4};
     int n = arr.length;
     int nextGreater = 0; 
     for(int i = 0; i<n; i++) {
    	 for(int j = i+1; j<n; j++ ) {
    		 if(arr[j] > arr[i]) {
    		 nextGreater = arr[j];
    	 break;
    		 }
    	 }
    		System.out.print(nextGreater+ " ");	
     }
	}

}
