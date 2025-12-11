class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int[] minr=new int[n+1];
        int[] maxr=new int[n+1];
        int[] minc=new int[n+1];
        int[] maxc=new int[n+1];
       Arrays.fill(minr,Integer.MAX_VALUE);
        Arrays.fill(minc,Integer.MAX_VALUE);
        for(int[] building:buildings){
            int x=building[0];
            int y=building[1];
            maxr[y]=Math.max(maxr[y],x);
            minr[y]=Math.min(minr[y],x);
            maxc[x]=Math.max(maxc[x],y);
            minc[x]=Math.min(minc[x],y);
        }
        int count=0;
        for (int[] building: buildings) {
            int x = building[0];
            int y = building[1];
            if (
                x > minr[y] && x < maxr[y] && y > minc[x] && y < maxc[x]
            ) {
                count++;
            }
        }
        return count;
    }
}