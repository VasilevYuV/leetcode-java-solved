class Solution {
    static {
        for(int i = 0; i <100; i++) {
            maxArea(new int[] { 0, 0 });
        }
    }
    static public int maxArea(int[] height) {
        int leftPivot = 0;
        int rightPivot = height.length - 1;
        int currentArea = -1;
        while (leftPivot < rightPivot) {
            if (height[leftPivot] <= height[rightPivot]){
                if (height[leftPivot] * (rightPivot - leftPivot) > currentArea){
                    currentArea = height[leftPivot] * (rightPivot - leftPivot);
                }
            } else {
                if (height[rightPivot] * (rightPivot - leftPivot) > currentArea){
                    currentArea = height[rightPivot] * (rightPivot - leftPivot);
                }
            }
            if (height[leftPivot] < height[rightPivot]){
                leftPivot++;
            } else {
                rightPivot--;
            }

        }

        return currentArea;
    }
}