class Solution {
    public int nextBeautifulNumber(int n) {
        for(int i=n+1;i<=1224444;i++){
            if(isBalanced(i)){
                return i;
            }
        }
        return -1;
    }

    private boolean isBalanced(int n){
        int[]temp = new int[10];
        while(n>0){
            temp[n%10]++;
            n=n/10;
        }
        for(int i=0;i<10;i++){
            if(temp[i]>0 && temp[i]!=i) return false;
        }
        return true;
    }
}