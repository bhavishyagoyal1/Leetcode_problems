class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[]freq=new int[101];
        int n=nums.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int m=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>m){
                m=freq[i];
            }
        }
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<freq.length;j++){
                if(freq[j]>0){
                    ans[k++]=j;
                    freq[j]--;
                }
            }
        }
        return ans;
    }
}