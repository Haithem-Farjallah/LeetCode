class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[51];
        for (int i = 0; i < n; i++) freq[nums[i]]++;
        if (k == n) {                   
            int max = -1;
            for (int i = 0; i < n; i++) max = Math.max(max, nums[i]);
            return max;
        }
        if (k == 1) {                  
            int ans = -1;
            for (int v = 0; v <= 50; v++) if (freq[v] == 1) ans = v;
            return ans;
        }
        int ans = -1;
        if (freq[nums[0]] == 1) ans = Math.max(ans, nums[0]);
        if (freq[nums[n - 1]] == 1) ans = Math.max(ans, nums[n - 1]);
        return ans;
    }
}