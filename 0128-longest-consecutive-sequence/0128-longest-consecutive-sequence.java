class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> numSet = new HashSet<>();
        for (int num: nums){
            numSet.add(num);
        }

        int longestSub = 1;

        for (int num: numSet){
            if (!numSet.contains(num - 1)){
                int currentSub = 1;
                while (numSet.contains(num + 1)){
                    num++;
                    currentSub++;
                }
                longestSub = Math.max(currentSub, longestSub);
            }
        }
        return longestSub;
    }
}