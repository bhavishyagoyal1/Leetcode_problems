class Solution {
    static String[] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> letter = new ArrayList<>();
        KeyPaid(digits,"",letter);
        return letter;
    }
    public static void KeyPaid(String ques,String ans,List<String> letter){
        if(ques.length()==0){
            letter.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String get = key[ch-'0'];
        for (int i = 0; i < get.length(); i++) {
            KeyPaid(ques.substring(1), ans + get.charAt(i),letter);
        }
    }
}