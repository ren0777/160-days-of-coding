// Last updated: 6/16/2026, 8:45:25 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr=new ArrayList<> ();
    int c=0;
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
            arr.add(i);}
        }
        return arr;
    }
}
 