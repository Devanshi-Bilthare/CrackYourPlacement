class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;

                char temp = st.peek();
                if(ch == ')' && temp == '(' || ch == ']' && temp == '[' || ch =='}' && temp == '{'){
                    st.pop();
                }else return false;
            }
        }


        return st.isEmpty();
    }
}