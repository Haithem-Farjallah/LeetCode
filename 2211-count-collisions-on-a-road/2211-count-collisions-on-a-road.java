class Solution {
    public int countCollisions(String directions) {
     int count = 0;
        int L = 0, R = directions.length() - 1;
        char[] s = directions.toCharArray();

        while (L < s.length && s[L] == 'L') L++;
        while (R>=0 && s[R]=='R') R--;
        
        for (int i = L; i <= R; i++){
            if (s[i] != 'S') count++;
        }
        return count;
    }
}