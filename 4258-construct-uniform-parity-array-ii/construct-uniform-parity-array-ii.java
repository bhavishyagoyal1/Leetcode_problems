class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int odd = 0;
        int minVal = Integer.MAX_VALUE;
        for(int num : nums1){
            if(num % 2!=0){
                odd++;
            }
            minVal = Math.min(minVal,num);
        }
        if(odd == 0) return true;
        if(minVal % 2 != 0)return true;
        return false;
    }
}