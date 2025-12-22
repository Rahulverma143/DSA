package leetcode;

//	6.  Merge Sorted Array
public class Merge_Sorted_Array_88 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		int[] temp = new int[m + n];
		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (nums1[i] <= nums2[j]) {
				temp[k++] = nums1[i++];
			} else {
				temp[k++] = nums2[j++];
			}
		}
		while (i < m) {
			temp[k++] = nums1[i++];
		}
		while (j < n) {
			temp[k++] = nums2[j++];
		}
		for (int x = 0; x < m + n; x++) {
			nums1[x] = temp[x];
		}

		for (int x = 0; x < m + n; x++) {
			System.out.print(nums1[x] + " ");
		}
	}
}
