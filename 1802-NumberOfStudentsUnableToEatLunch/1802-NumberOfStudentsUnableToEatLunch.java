// Last updated: 6/16/2026, 8:45:52 AM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> st=new LinkedList<>();
        Queue<Integer> sand=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            st.add(students[i]);
        }
        for(int i=0;i<sandwiches.length;i++){
            sand.add(sandwiches[i]);
        }

        int counter=0;
        while(counter< st.size() && !st.isEmpty()){
            int topstud=st.poll();
            if(topstud==sand.peek()){
                sand.poll();
                counter=0;
            }
            else{
                counter++;
                st.add(topstud);
            }
        }
        return st.size();

    }
}