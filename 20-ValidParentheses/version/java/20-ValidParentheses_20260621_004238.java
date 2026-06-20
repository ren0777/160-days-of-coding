// Last updated: 6/21/2026, 12:42:38 AM
1class Solution {
2    public static boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4
5        for (char c : s.toCharArray()) {
6            if (c == '(') {
7                st.push(')');
8            } else if (c == '{') {
9                st.push('}');
10            } else if (c == '[') {
11                st.push(']');
12            } else {
13                if (st.isEmpty() || st.pop() != c) {
14                    return false;
15                }
16            }
17        }
18        return st.isEmpty();
19    }
20}