class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i = 0;i < n;i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);

        long totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        for(int i = 0;i < n/2;i++){
            totalSum -= (long)2*nums[i];
        }

        return totalSum;
    }
}