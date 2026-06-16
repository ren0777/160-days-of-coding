// Last updated: 6/16/2026, 8:47:12 AM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st=new Stack();
        for(String v: tokens){
            if(v.equals("+")|| v.equals("-") || v.equals("*") || v.equals("/")){
                int f=st.peek();
                st.pop();
                int s=st.peek();
                st.pop();
                switch(v){
                    case "+":
                    st.push(s+f);
                    break;
                    case "-":
                    st.push(s-f);
                    break;
                    case "*":
                    st.push(s*f);
                    break;
                    case "/":
                    st.push(s/f);
                }
            }
            else{
                st.push(Integer.parseInt(v));
            }
        }
            
            return st.pop();
    }
}