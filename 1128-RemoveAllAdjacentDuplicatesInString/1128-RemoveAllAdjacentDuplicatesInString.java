// Last updated: 6/16/2026, 8:46:14 AM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        
        for (int i=0; i<s.length() ;i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        String ans="";
        while(!stack.isEmpty()){
            ans=stack.pop()+ans;
        }
        return ans;
    }
}