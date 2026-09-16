class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        combination(candidates,target,0,ans,new ArrayList<Integer>());
        return ans;
    }
    public static void combination(int[]candidates,int target,int idx,List<List<Integer>>ans,List<Integer>ll){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(target>=candidates[i]){
                ll.add(candidates[i]);
                combination(candidates,target-candidates[i],i,ans,ll);
                ll.remove(ll.size()-1);
            }
        }
    }
}