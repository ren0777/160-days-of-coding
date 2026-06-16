// Last updated: 6/16/2026, 8:48:23 AM
class Solution {
    public int romanToInt(String s) {
        HashMap <Character,Integer> roman=new HashMap<>();
        int res=0;
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        for(int i=0;i<s.length()-1;i++){
            if(roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){
            res-=roman.get(s.charAt(i));
            } 
        else{

            res+=roman.get(s.charAt(i));
        }
    }
    return res+roman.get(s.charAt(s.length()-1));
    }

}