class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)return 0;
        int currentMax=nums[0],result=nums[0];
        for(int i=1;i<nums.length;i++){
            currentMax=Math.max(currentMax+nums[i],nums[i]);
            result=Math.max(result,currentMax);
        }
        return result;
    }
}