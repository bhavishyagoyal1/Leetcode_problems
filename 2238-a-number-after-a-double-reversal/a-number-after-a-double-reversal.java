class Solution {
    public boolean isSameAfterReversals(int n) {
        int rev=0;
        int ori=n;
        while(n>0){
            int ld=n%10;
            rev=rev*10+ld;
            n/=10;
        }
        int r=0;
        while(rev>0){
            int ld=rev%10;
            r=r*10+ld;
            rev/=10;
        }
        return r==ori;
    }
}