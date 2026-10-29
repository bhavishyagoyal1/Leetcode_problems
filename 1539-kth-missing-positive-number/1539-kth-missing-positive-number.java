class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0;
        int num=1;
        int ans=0;
        while(true){
            if(i<arr.length&&num==arr[i]){
                i++;
            }else{
                k--;
                if(k==0){
                    return num;
                }
            }
            num++;
        }

    }
}