class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                int l=j-i+1;
                if(l%2!=0){
                    ans+=sum;
                }
            }
        }
        return ans;
    }
}