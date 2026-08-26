class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int divide=k;
        while(set.contains(divide)){
            divide+=k;
        }
        return divide;
    }
}