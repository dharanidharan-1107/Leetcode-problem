
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int bp = -1;
        for(int i = 0; i + 1 < n; i++) {
            if(nums[i] < nums[i + 1]) {
                bp = i;
            }
        }
        if(bp == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        int justLargestIdx = -1;
        for(int i = bp + 1; i < n; i++) {
            if(nums[bp] < nums[i]) {
                justLargestIdx = i;
            }
        }
        int temp = nums[bp];
        nums[bp] = nums[justLargestIdx];
        nums[justLargestIdx] = temp;
        reverse(nums, bp + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
