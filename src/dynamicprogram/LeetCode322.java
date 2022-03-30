package dynamicprogram;
/*
322. 零钱兑换 链接：https://leetcode-cn.com/problems/coin-change

给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。

计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。

你可以认为每种硬币的数量是无限的。

示例 1：

输入：coins = [1, 2, 5], amount = 11
输出：3
解释：11 = 5 + 5 + 1

示例 2：

输入：coins = [2], amount = 3
输出：-1

示例 3：

输入：coins = [1], amount = 0
输出：0

分析：
    amount: 金额数 res:最少硬币数 res = min(amount)
    初始 amount = 0, res = 0;
    状态转移 amount = N;
    res = min( min(amount-coins[0]),min(amount-coins[1]),...min(amount-coins[len-1])) + 1
    amount的最少硬币数 等于 (amount减去数组金币面额) 所需的最少金币数 + 1
    例如：
    输入：coins = [1, 2, 5], amount = 11
    f(11) = min( f(11-1),f(11-2),f(11-5)) + 1



 */
public class LeetCode322 {
    public static void main(String[] args) {
        int [] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));

    }

    public static int coinChange(int[] coins, int amount) {
        int res ;
        int min = Integer.MAX_VALUE;
        if(amount == 0){
            res = 0;
            return res;
        }

        for (int i = 0; i < coins.length; i++) {
            min = Math.min(min,coinChange(coins,amount-coins[i]));
        }
        res = min +1;

        return res;
    }
}
