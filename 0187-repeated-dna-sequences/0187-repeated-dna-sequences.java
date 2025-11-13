class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Set<String> seen = new HashSet<>();
        if (s.length()<10) return result;
        for(int i=0;i+9<s.length();i++){
           String dummy=s.substring(i,i+10);
           if(seen.contains(dummy)){
            set.add(dummy);
           }
           seen.add(dummy);
           
        }
        return new ArrayList(set);
    }
}