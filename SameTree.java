
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == q) return true; // null == null
    if (p == null || q == null) return false;
    return p.val == q.val &&
           isSameTree(p.right , q.right) &&
           isSameTree(p.left, q.left);   
}
}
