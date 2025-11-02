/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> result=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode dummy=null;
           for(int i=queue.size() ; i>0 ; i--) {
            TreeNode t=queue.poll();
            if(t!=null){
                dummy=t;
                queue.add(t.left);
                queue.add(t.right);
            }
           }
           if(dummy!=null){
            result.add(dummy.val);
           }
        }
        return result;
    }
}