package string;

import java.sql.ResultSet;

/**
 * 5. 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 * 提示：
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母组成
 *
 * 思路：
 *   暴力思路：判断一个字符串(len = n)是否回文的时间复杂度为O(n/2) 一个串有 (len) + (len-1) + ....1个子串 n^2的子串
 *            如果对每一个子串都做判别，时间复杂度在o(n^3)。
 *    优化思路：判断字符串是否回文的思路是固定的，即搜索方法是固定的。优化点在搜索范围。
 *    回文串如“aba”, "abba"他们的特点在于存在中心点(1个或2个）,以中心点向两边扩展字符相等。
 *    如果判断字符串每个元素是否为回文串的中心点，那么需要判断n个点，每个点至多走过n/2长的字符串，时间复杂度o(n^2)
 * 解法：
 *   for(遍历i){
 *       s[i]是否为回文串中心点
 *       s[i],s[i+1]是否为回文串中心点
 *   }
 *
 */

public class LeetCode005 {
    public static void main(String[] args) {
        String s = "a";
       //longestPalindrome(s);
        System.out.println(longestPalindrome(s));
        // String s2 = "cbbd";
        // System.out.println(longestPalindrome(s2));
        // String s3 = "ac";
        // //longestPalindrome(s3);
        // System.out.println(longestPalindrome(s3));


    }
    public static String longestPalindrome(String s) {
        //最后一个字符没必要判断
        String result = s.substring(0,1);
        for (int i = 0; i < s.length() - 1; i++) {
            //以i为中心判别
            String s1 = isHuiwen(s,i,i);
            String s2 = "";
            //以i,i+1为中心判别 s[i] = s[i+1]
            if(s.charAt(i) == s.charAt(i+1)){
                 s2 = isHuiwen(s,i,i+1);
            }
            //记录本轮s1,s2最多
            result = (s1.length() >= result.length()) ? s1:result;
            result = (result.length() >= s2.length())? result:s2;


        }
        return result;
    }

    public static String isHuiwen(String s,int l,int r){
        //初始 s[l] = s[r]
        //l,f指针不越界，且所指向元素相等
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        // 回文串的长度
        // 不是的话返回自身长度1
        return s.substring(l+1,r);
    }


}
