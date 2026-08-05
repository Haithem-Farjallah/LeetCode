class Solution {
    public int longestConsecutive(int[] nums) {
     Set<Integer> set = new HashSet<>();
     for(int n:nums){
        set.add(n);
     }   
     int seq=0; 
     for(int curr:set){
        if(!set.contains(curr-1)){
            int inc=1;
            while(set.contains(curr+inc)){
                inc++;
            }
            seq=Math.max(seq,inc);
        }
     }
    return seq;
    }
}