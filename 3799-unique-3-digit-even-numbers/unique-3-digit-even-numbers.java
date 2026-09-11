class Solution {
    public int totalNumbers(int[] nums) {
        int n=nums.length;
        HashSet<Integer>ans=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j && j!=k && k!=i && nums[i]!=0){
                        int nu=nums[i]*100 + nums[j]*10 + nums[k];
                        if(nu%2==0){
                            ans.add(nu);
                        }
                    }
                }
            }
        }
        return ans.size();
    }
}