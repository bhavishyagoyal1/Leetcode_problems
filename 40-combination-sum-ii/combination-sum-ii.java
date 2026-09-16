class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates,target,0,ans,new ArrayList<Integer>());
        return ans;
    }
    public static void combination(int[]candidate,int target,int idx,List<List<Integer>>ans,List<Integer>ll){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<candidate.length;i++){
            if(i>idx&&candidate[i]==candidate[i-1]) continue;
            if(target<candidate[i]) break;
                ll.add(candidate[i]);
                combination(candidate,target-candidate[i],i+1,ans,ll);
                ll.remove(ll.size()-1);
            
        }
    }
}