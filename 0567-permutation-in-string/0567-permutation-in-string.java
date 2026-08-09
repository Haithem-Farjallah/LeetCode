class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] letters =new int[26];
        for(int i=0;i<s1.length();i++){
            letters[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length();i++){
          if(letters[s2.charAt(i)-'a']==0) continue;
          int [] lettersCopy =new int[26];
          for(int j=i;j<s2.length();j++){
            if(letters[s2.charAt(j)-'a']==0) break;
            lettersCopy[s2.charAt(j)-'a']++;
            if(Arrays.equals(letters,lettersCopy)) return true;
          }
        }
        return false;
    }
}