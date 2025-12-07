class Solution {
    public void nextPermutation(int[] nums) {
        int index1 = -1;
        int index2 = -1;
        for (int i = nums.length-2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                index1 = i;
                break;
            }
        }
        if (index1 == -1) {
            reverse(nums, 0);
        } else {
            for (int i = nums.length-1; i >= index1; i--) {
                if (nums[i] > nums[index1]) {
                    index2 = i;
                    break;
                }
            }

            swap(nums,index1,index2);
            reverse(nums,index1+1);
        }
    }

    public void swap (int[] nums, int i, int j) {
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];

        /* nums[i] = nums[i] + nums[j];
           nums[j] = nums[i] - nums[j];
           nums[i] = nums[i] - nums[j];
        */
    }

    public void reverse (int[] nums, int start) {
        for (int i = nums.length-1; i > start; i--) {
            swap(nums, start, i);
            start++;
        }
    }
}