class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int left = 0; 
        int res = 0;

        while (left < n) {
            int right = left;
            int total = 0;
            int maxTime = 0;

            while (right < n && colors.charAt(right) == colors.charAt(left)) {
                total += neededTime[right];
                maxTime = Math.max(maxTime, neededTime[right]);
                right++;
            }
            res += total - maxTime;
            left = right;
        }

        return res;
    }
}