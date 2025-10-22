class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>=2;i--){
            int L=0; int R=i-1;
            while(L<R){
                if(nums[L]+nums[R]>nums[i]){
                    count+=R-L;
                    R--;
                }else{
                    L++;
                }
            }
        }
        return count;
    }
}