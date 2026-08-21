/*
Sorting, and noting index clarity pro max!!

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] arr = {2,4,6,3,9,8,1};
		int[][] A = new int[arr.length][2];
		for(int i=0;i<arr.length;i++){
		    A[i][0] = arr[i];
		    A[i][1] = i;
		}
		Arrays.sort(A, Comparator.comparingInt(a -> a[0]));
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<2;j++){
		        System.out.print(A[i][j]+" ");
		    }
		    System.out.println();
		}
		
		System.out.println("\nNiche Descending\n");
		Arrays.sort(A, Comparator.comparingInt((int[] a) -> a[0]).reversed());
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<2;j++){
		        System.out.print(A[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
*/

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] A = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            A[i][0] = nums[i];
            A[i][1] = i;
        }

        Arrays.sort(A, Comparator.comparingInt(a -> a[0]));

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int cur = A[i][0] + A[j][0];
            if (cur == target) {
                return new int[]{Math.min(A[i][1], A[j][1]),
                                 Math.max(A[i][1], A[j][1])};
            } else if (cur < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}