package dynamicprogram;
/*
剑指 Offer 42. 连续子数组的最大和

输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。

要求时间复杂度为O(n)。

思路：.....

 */
public class Offer42 {
    public static void main(String[] args) {

    }

    // res记录连续数组的最大和
    // nums[i] 修改为以i为结尾的子数组的最大和，nums[0]不变
    // 初始 res = nums[0]
    // 从1开始遍历，若nums[i-1]>0 ,说明最大和应包括nums[i-1]
    // 否则不包括
    // 每次循环后更新res
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i-1],0);
            res = Math.max(res,nums[i]);
        }
        return res;
    }
}
