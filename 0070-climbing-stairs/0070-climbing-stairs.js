/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    if (n===1) return 1;
    if (n===2) return 2;
    let arr=[1,2]
    for (let i=2;i<n;i++){
        arr.push(arr[i-1]+arr[i-2])
    }
    return arr[arr.length-1]
   /* if(n===1||n===2) return n
    else return climbStairs(n-1)+climbStairs*/
    //attention cette solution est O(n^2)
};