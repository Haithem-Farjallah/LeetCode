class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int total=nums[0];
        for(int n:nums){
            set.add(n);
        }
        int i=1;
       while(i<nums.length && nums[i]==nums[i-1]+1){
        total +=nums[i];
        i++;
       }
       while(set.contains(total)){
        total++;
       }
       return total;
    }
}