package day18.exercise;

import java.util.Arrays;
import java.util.List;

public class SortAnArray {
    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        int[] nums2 = {8,2,5,3,9,4,7,6,1};

        sortArrayBubbleSort(nums);
        System.out.println(Arrays.toString(nums));

        sortArrayQuickSort(nums2,0,nums2.length-1);
        System.out.println(Arrays.toString(nums2));

    }

    public static void sortArrayQuickSort(int[] nums, int start, int end) {
        if (start < end) {
            int pivot = partition(nums, start, end);
            sortArrayQuickSort(nums, start, pivot - 1);
            sortArrayQuickSort(nums, pivot + 1, end);
        }
    }

    public static int[] sortArrayBubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]>nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start -1;
        for (int j = start; j<=end; j++){
            if (nums[j]<pivot){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        i++;
        int temp = nums[i];
        nums[i] = nums[end];
        nums[end] = temp;
        return i;
    }




}
