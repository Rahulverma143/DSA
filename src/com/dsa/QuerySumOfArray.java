package com.dsa;

public class QuerySumOfArray {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int Query[][]= {{0,2}, {0,3},{0,4}};
		
		int sum = 0;
		for(int i = 0; i<Query.length; i++) {
			int start = Query[i][0];
			int end = Query[i][1];
			
			sum = 0;
		for(int k =start; k<end; k++) {
			sum+=arr[k];
		}
		System.out.println(sum);
		}
	}

}
