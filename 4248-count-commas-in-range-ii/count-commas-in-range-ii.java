class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        long start=1000;
        long count=0;
        while(start<=n){
            count+=(n-start+1);
            start*=1000;
        }
        return count;
    }
}