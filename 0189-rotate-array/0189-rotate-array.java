class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        flip(nums,0,n-1);
        flip(nums,0,k-1);
        flip(nums,k,n-1);
    }   
    public void flip(int[] nums, int L, int R){
        while(R>L){
            int temp = nums[R];
            nums[R]=nums[L];
            nums[L]=temp;
            R--;L++;
        }
    }
}