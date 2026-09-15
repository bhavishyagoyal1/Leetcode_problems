class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        permutation(nums,0,ans);
        return ans;
    }
    public static void permutation(int[]nums,int idx,List<List<Integer>>ans){
        int n=nums.length;
        if(idx==n){
            List<Integer>temp=new ArrayList<>();
            for(int x:nums){
                temp.add(x);
            }
            if(!ans.contains(temp)){
            ans.add(temp);
            return;
        }
       
        }
        for(int i=idx;i<n;i++){
            solve(nums,i,idx);
            permutation(nums,idx+1,ans);
            solve(nums,i,idx);
        }
    }
    public static void solve(int[]nums,int i,int idx){
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
}