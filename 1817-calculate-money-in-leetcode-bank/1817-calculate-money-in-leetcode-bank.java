class Solution {
    public int totalMoney(int n) {
        int start=1,sum=0;
        while(n>0){
            int last=Math.min(n,7);
            sum+=((last*(2*start+last-1)))/2;
            start++;
            n=n-last;
        }   
        return sum;
    }
}