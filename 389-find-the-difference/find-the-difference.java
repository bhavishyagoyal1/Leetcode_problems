class Solution {
    public char findTheDifference(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        char ans=0;
        for(int i=0;i<n1;i++){
            ans^=s.charAt(i);
        }
        for(int i=0;i<n2;i++){
            ans^=t.charAt(i);
        }
        return ans;
    }
}