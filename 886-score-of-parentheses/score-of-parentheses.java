class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int curr = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                st.push(curr);
                curr = 0;
            } 
            else {
                if (curr == 0) {
                    curr = 1;       // ()
                } else {
                    curr = 2 * curr; // (A)
                }
                curr += st.pop();   // AB case
            }
        }
        return curr;
    }
}