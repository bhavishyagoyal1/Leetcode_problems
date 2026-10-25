class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum=0;
        int n=nums.length;
        long []gain=new long[n];
        for(int i=0;i<n;i++){
            int num=nums[i];
            sum+=nums[i];
            ArrayList<Integer>ll=new ArrayList<>();
            int temp=nums[i];
            while(temp>0){
                int a=temp%10;
                ll.add(a);
                temp/=10;
            }
            Collections.sort(ll);
            int max=0;
            for(int j=ll.size()-1;j>=0;j--){
                max=max*10+ll.get(j);
            }
            gain[i]=max-num;
        }
        Arrays.sort(gain);
        for(int i=gain.length-1;i>=0 && k>0;i--,k--){
            sum+=gain[i];
        }
        return sum;
    }
}