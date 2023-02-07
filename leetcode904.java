class Solution {
    public int totalFruit(int[] tree) {
        // record the last index of each type of fruit  
        // such that we have the information about when there is an empty blanket
        Map<Integer, Integer> basket = new HashMap<>();
        int i = 0, j = 0, N = tree.length, ans = 0;
        while (j < N) {
            if (basket.size() < 2 || basket.containsKey(tree[j])) {
                basket.put(tree[j], j);
                j++;
            } else {
                ans = Math.max(ans, j - i); // update the result
                while (basket.size() == 2) {
                    // all furits of tree[i] exit their blanket, an empty blanket is out
                    if (i + 1 > basket.get(tree[i])) {
                        basket.remove(tree[i]);
                    }
                    i ++;
                }
            }
        }
        // j might excceed the boundary, then we need to count the max again. 
        return Math.max(j - i, ans);
    }
}
