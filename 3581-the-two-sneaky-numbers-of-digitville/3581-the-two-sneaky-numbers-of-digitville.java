class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer>temp=new HashSet<>();
        int i=0;
        int res[]=new int[2];
        for(int j=0;j<nums.length;j++){
            if(temp.contains(nums[j])){
                res[i]=nums[j];
                i++;
                if(i==2) return res;
            }
            temp.add(nums[j]);
        }
        return null;
    }
}