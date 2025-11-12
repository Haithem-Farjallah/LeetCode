class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=0;i<s.length()-1;i++){
            if(isValidSubstring(s,s.substring(0,i+1))) return true;
        }
        return false;
    }
    public boolean isValidSubstring(String s, String sub){
        StringBuilder temp=new StringBuilder();
        while(temp.length()<s.length()){
            temp.append(sub);
            if(temp.toString().equals(s)){
                return true;
            }
        }
        return false;
    }
}