package leetcode.daily.d202304.d230405;

public class MinMaxSum {
}

class Solution {
    public int minimizeArrayValue(int[] nums) {
        // Initialize answer and the prefix sum.
        long answer = 0, prefixSum = 0;

        // Iterate over nums, update prefix sum and answer.
        for (int i = 0; i < nums.length; ++i) {
            prefixSum += nums[i];
            answer = Math.max(answer, (prefixSum + i) / (i + 1));
        }

        return (int) answer;
    }
}