package LeetCode.Merge_Sorted_Array;
//1.merge 2 array into 1 single array
//2.

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1; // pointer for the last element array nums1
        int j = n-1; // pointer for the last element array nums2
        int k = m+n -1; // pointer for the last element array temp

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]){

                nums1[k--] = nums1[i--];

            }else {
                nums1[k--] = nums2[j--];
            }
        }
    }

}
