package sort;

import java.util.Random;

/**
 * 快速排序
 * <p>
 * 思想：
 * 1.首先设定一个分界值，通过该分界值将数组分为左右两部分
 * 2.将大于或等于分界值的数据集中到数组右边，小于分界值的数据集中到数组左边
 * 此时左边元素都小于分界值，而右边部分中各元素都大于或等于分界值
 * 3.然后，左边和右边的数据可以独立排序。对于两侧的数组继续选取边界值，进行上述操作
 * 4.重复上述过程(递归)
 * <p>
 * 实现：
 * 如何将大于或等于分界值的数据集中到数组右边，小于分界值的数据集中到数组左边
 * 考虑双指针思想，r指针从后扫描，l指针从头扫描，当r指针遇到小于边界值，l指针遇到大于边界值，就互换
 * ????能否自己改
 */
public class QuicklySort {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 3, 3, 7, 9, 122344, 4656, 34, 34, 4656, 5, 6, 7, 8, 9, 343, 57765, 23, 12321};
        int len = arr.length - 1;


    }


    // 快速排序 1：基本快速排序

    private static final Random RANDOM = new Random();


    public int[] sortArray(int[] nums) {
        int len = nums.length;
        quickSort(nums, 0, len - 1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right) {

        int pIndex = partition(nums, left, right);
        quickSort(nums, left, pIndex - 1);
        quickSort(nums, pIndex + 1, right);
    }


    private int partition(int[] nums, int left, int right) {
        int randomIndex = RANDOM.nextInt(right - left + 1) + left;
        swap(nums, left, randomIndex);

        // 基准值
        int pivot = nums[left];
        int lt = left;
        // 循环不变量：
        // all in [left + 1, lt] < pivot
        // all in [lt + 1, i) >= pivot
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] < pivot) {
                lt++;
                swap(nums, i, lt);
            }
        }
        swap(nums, left, lt);
        return lt;
    }

    /**
     * 两数交换
     * @param nums
     * @param index1
     * @param index2
     */
    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}

