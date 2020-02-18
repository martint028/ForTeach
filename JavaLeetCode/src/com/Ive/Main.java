package com.Ive;


/*
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/

public class Main {

    public static void main(String[] args) {

        class Solution {
                        public void merge(int[] nums1, int m, int[] nums2, int n) {
                int i1 = m - 1;
                int i2 = n - 1;
                int cur = m+n-1;
                while (i2 >= 0) {
                    if (i1 >= 0 && nums2[i2] < nums1[i1]) {
                        nums1[cur--] = nums1[i1--];
                    } else {
                        nums1[cur--] = nums2[i2--];
                    }
                }
                for (int num : nums1
                ) {
                    System.out.println(num);
                }

            }

            public void merge1(int[] nums1, int m, int[] nums2, int n) {
                // nums1 = [1,3,5,0,0,0], m = 3
                // nums2 = [2,4,6],       n = 3
                int i1 = m - 1;
                int i2 = n - 1;
                int cur = i1+i2+1;

                while (i2 >= 0) {
                    if (i1 >= 0 && nums2[i2] < nums1[i1]) {
                        nums1[cur--] = nums1[i1--];
                    } else {
                        nums1[cur--] = nums2[i2--];
                    }
                }
                for (int num : nums1
                ) {
                    System.out.println(num);
                }
            }

            public void merge2(int[] nums1, int m, int[] nums2, int n) {
                int i = m--+--n;

                while(n>=0) {
                    nums1[i--] = m>=0 && nums1[m]>nums2[n] ? nums1[m--] : nums2[n--];
                }
                for (int num : nums1
                ) {
                    System.out.println(num);
                }
            }

        }
	// write your code here
        int[] num1 = new int[10];
        num1[0] = 13;
        num1[1] = 14;
        num1[2] = 15;
        num1[3] = 16;
        int m = 4;
        int[] num2 = new int[]{6,17};
        int n = 2;
        var sol = new Solution();
        sol.merge(num1,m,num2,n);
        System.out.println("End");
    }

}
