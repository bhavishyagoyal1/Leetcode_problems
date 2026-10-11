class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int ans=0;
        int i=1;
        for(int j=0;j<n;j++){
            if(n%i==0){
                int s=nums[j]*nums[j];
                ans+=s;
            }
            i++;
        }
        return ans;
    }
}