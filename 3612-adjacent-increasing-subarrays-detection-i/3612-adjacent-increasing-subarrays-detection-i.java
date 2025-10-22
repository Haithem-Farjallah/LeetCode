class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        for(int i=0;2*k+i<=n;i++){
            if(isValidSubarray(nums,i,i+k-1) && isValidSubarray(nums,i+k,i+2*k-1))return true;
        }
        return false;
    }
    public boolean isValidSubarray(List<Integer> nums, int L,int R){
        for(int i=L;i<R;i++){
            if(nums.get(i+1)<=nums.get(i)) return false;
        }
        return true;
    }
}