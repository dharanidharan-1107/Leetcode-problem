class Solution {
    public int maxArea(int[] h) {
        int left=0;
        int right= h.length-1;
        int length=0;
        int breadth=0;
        int area =0;
        int max =Integer.MIN_VALUE;
        while(left<right){
            length = Math.min(h[left] , h[right]);
            breadth =  right -left;
            area = length*breadth;
            max = Math.max(max,area);

            if(h[left]<h[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}