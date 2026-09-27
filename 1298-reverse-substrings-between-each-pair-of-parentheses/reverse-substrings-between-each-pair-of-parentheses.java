class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            
            if(ch == ')'){
                StringBuilder sb = new StringBuilder();
                while(!st.peek().equals('(')){
                    sb.append(st.pop());
                }
                st.pop();

                for(char c : sb.toString().toCharArray()){
                    st.push(c);
                }
                
            }else{
                st.push(ch);
            }
            

        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}