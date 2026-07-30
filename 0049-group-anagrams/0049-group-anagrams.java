class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] dummy = new int[26];
            for(int j=0;j<strs[i].length();j++){
                dummy[strs[i].charAt(j)-'a']++;
            }
            String key=Arrays.toString(dummy);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(strs[i]);
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}