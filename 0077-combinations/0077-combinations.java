class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        solve(n,k,1,ans,temp);
        return ans;
    }
    public void solve(int n,int k,int idx,List<List<Integer>>ans,List<Integer>temp){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(temp.size()>k||idx>n){
            return;
        }
        temp.add(idx);
        solve(n,k,idx+1,ans,temp);
        temp.remove(temp.size()-1);
        solve(n,k,idx+1,ans,temp);
    }
}