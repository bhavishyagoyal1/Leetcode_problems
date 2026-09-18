class Solution {
    public int minimumLength(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            char ch=s.charAt(l);
            if(s.charAt(r)!=s.charAt(l)) break;
            while(l<=r&&s.charAt(r)==ch) r--;
            while(l<=r && s.charAt(l)==ch) l++;
        }
        return r-l+1;
    }
}