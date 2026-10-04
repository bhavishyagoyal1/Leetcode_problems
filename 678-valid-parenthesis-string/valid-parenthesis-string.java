class Solution {
    public boolean checkValidString(String s) {
       int mino=0;
       int maxo=0;
       for(char ch:s.toCharArray()){
        if(ch=='('){
            mino++;
            maxo++;
        }
        else if(ch==')'){
            mino--;
            maxo--;
        }
        else{
            mino--;
            maxo++;
        }
        if(maxo<0){
            return false;
        }
        mino=Math.max(0,mino);
       }
       return mino==0;
    }
}