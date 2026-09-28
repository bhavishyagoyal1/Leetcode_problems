class Solution {
    public int maxDepth(String s) {
        int m=0;
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') c++;
            if(ch==')') c--;
            m=Math.max(m,c);
        }
        return m;
    }
}