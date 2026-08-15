class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];

        int L = 0;
        int res = 0;

        for (int R = 0; R < s.length(); R++) {

            count[s.charAt(R) - 'a']++;
            while (count[s.charAt(R) - 'a'] > 2) {
                count[s.charAt(L) - 'a']--;
                L++;
            }
            res = Math.max(res, R - L + 1);
        }

        return res;
    }
}