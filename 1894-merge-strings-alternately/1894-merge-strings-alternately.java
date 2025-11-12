class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result=new StringBuilder();
        int i=0;
        int minLen=Math.min(word1.length(),word2.length());
        while(i<minLen){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;
        }   
        if(i<word1.length()){
            result.append(word1.substring(i));
        }
        if(i<word2.length()){
            result.append(word2.substring(i));
        }
        return result.toString();
    }
}