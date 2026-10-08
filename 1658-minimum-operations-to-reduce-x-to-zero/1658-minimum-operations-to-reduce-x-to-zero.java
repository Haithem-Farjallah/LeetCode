class Solution {
    public int minOperations(int[] nums, int x) {
        int total= 0;
        for (int n: nums){
            total+=n;
        }
        int target = total-x;
        int L=0, sum=0,res=-1;
        
        if(target ==0) return nums.length;
        if (x > total) return -1;


        for(int R=0;R<nums.length;R++){
            sum+=nums[R];
            while(sum>target){
                sum-=nums[L++];
            }
            if(sum==target){
                res=Math.max(res,R-L+1);
            }
        }
        return res==-1 ? -1 : nums.length-res;
    }
}