class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        permutation(nums,0,ans);
        return ans;
    }
    public static void permutation(int[]nums,int idx,List<List<Integer>>ans){
        int n=nums.length;
        if(n==idx){
            List<Integer>temp=new ArrayList<>();
            for(int x:nums){
                temp.add(x);
            }
            ans.add(temp);
            return;
        }
        for(int i=idx;i<n;i++){
            swap(nums,i,idx);
            permutation(nums,idx+1,ans);
            swap(nums,i,idx);
        }
    }
    public static void swap(int[]nums,int i,int idx){
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
}