class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int num:nums){
            int evenCount=0;
            while(num!=0){
                int ld=num%10;
                num/=10;
                evenCount++;
            }
            if(evenCount%2==0){
                even++;
            }
        }
        return even;
    }
}