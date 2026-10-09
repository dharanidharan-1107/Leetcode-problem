import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int currSum = nums[i] + nums[l] + nums[r];
                int currDiff = Math.abs(currSum - target);

                if (currDiff < minDiff || (currDiff == minDiff && currSum > res)) {
                    minDiff = currDiff;
                    res = currSum;
                }

                if (currSum > target) r--;
                else l++;
            }
        }
        return res;
    }
}