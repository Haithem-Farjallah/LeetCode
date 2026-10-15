class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int total_gas=0,total_cost=0;
        int curr=0, starting_point=0;
        for(int i=0;i<n;i++)
        {
            total_gas+=gas[i];
            total_cost+=cost[i];
            curr+=gas[i]-cost[i];
            if(curr<0)
            {
                starting_point=i+1;
                curr=0;
            }
        }
        return (total_gas<total_cost)?-1:starting_point;     
    } 
}