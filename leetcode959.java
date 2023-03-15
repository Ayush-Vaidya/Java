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
    public boolean isCompleteTree(TreeNode root) {
	if(root == null){
        return true;
    }
	
	
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    boolean flag = false;
    
    while(!queue.isEmpty()){
        int size = queue.size();
        
        for (int i = 0 ; i < size ; i++){
            TreeNode polledNode = queue.poll();
            if(polledNode != null){
                if(flag == true){
                    return false;
                }
                queue.offer(polledNode.left);
                queue.offer(polledNode.right);
            }else{
                flag = true;
            }
        }  
    }
    return true;
}
    
}
