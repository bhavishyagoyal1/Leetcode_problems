class Solution {
    public int minCostToMoveChips(int[] position) {
        int ev=0;
        int od=0;
        int ans=0;
        for(int x:position){
            if(x%2==0){
                ev++;
            }else{
                od++;
            }
        }
        ans=Math.min(ev,od);
        return ans;
    }
}