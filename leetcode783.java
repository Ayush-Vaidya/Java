class Solution {
    
    public int minDiffInBST(TreeNode root) {
        List<Integer> arr = new ArrayList();
        int min = Integer.MAX_VALUE;
        
        minDiffInBSTAux(root, arr);
        Collections.sort(arr); 
        
        for(int i = 1; i<arr.size(); i++){
            min = Math.min(arr.get(i)-arr.get(i-1), min);
        }
        
        
        return min;
    }
    
    public void minDiffInBSTAux(TreeNode node, List<Integer> arr) {
        if(node!=null){
            arr.add(node.val);
            minDiffInBSTAux(node.left, arr);
            minDiffInBSTAux(node.right, arr);
        }
    }
}
