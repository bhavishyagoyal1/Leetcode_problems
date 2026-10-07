class Solution {

    Set<String> list;
    int maxLen = 0;
    public List<String> removeInvalidParentheses(String s) {

        list = new HashSet<>();
        solve(s, 0, 0, 0, new StringBuilder());

        

        List<String> ans = new ArrayList<>();

        for(String st : list){
            if(st.length()!=maxLen){
                continue;
            }

            ans.add(st);
        }

        return ans;
    }

    public void solve(String s, int i, int open, int close, StringBuilder sb){

        if(i>=s.length()){
            if(open==close){
                maxLen = Math.max(maxLen, sb.length());
                list.add(sb.toString());
            }
            return;
        }

        int len = sb.length();

        if(s.charAt(i)=='('){
            sb.append('(');
            solve(s, i+1, open+1, close, sb);
            sb.setLength(len);
        }else if(s.charAt(i)==')'){
            if(close<open){
                sb.append(')');
                solve(s, i+1, open, close+1, sb);
                sb.setLength(len);
            }
        }else{
            sb.append(s.charAt(i));
            solve(s, i+1, open, close, sb);
            return;
        }

        solve(s, i+1, open, close, sb);
    }
}