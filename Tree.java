class Solution {
    class UnionSet {
        int[] pa;
        public UnionSet(int n) {
            pa = new int[n];
            for (int i = 0; i < pa.length; ++i) {
                pa[i] = i;
            }
        }
        public int getParent(int v) {
            if (pa[v] != v) {
                pa[v] = getParent(pa[v]);
            }
            return pa[v];
        }
        public void union(int a, int b) {
            pa[getParent(a)] = getParent(b);
        }
    }
    
    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        int ans = vals.length;
        int[][] we = new int[edges.length][3];
        Map<Integer, Map<Integer,Integer>> mp = new HashMap<>();
        for (int i = 0; i < edges.length; ++i) {
            we[i][0] = edges[i][0];
            we[i][1] = edges[i][1];
            we[i][2] = Math.max(vals[edges[i][0]], vals[edges[i][1]]);
            mp.compute(we[i][0], (k, v) -> v == null ? new HashMap<>() : v).put(vals[edges[i][0]], 1);
            mp.compute(we[i][1], (k, v) -> v == null ? new HashMap<>() : v).put(vals[edges[i][1]], 1);
        }
        Arrays.sort(we, (a, b) -> a[2] - b[2]);
        UnionSet us = new UnionSet(vals.length);
        for (int[] e : we) {
            int pa = us.getParent(e[0]), pb = us.getParent(e[1]);
            int va = mp.compute(pa, (k, v) -> v == null ? new HashMap<>() : v).getOrDefault(e[2], 0);
            int vb = mp.compute(pb, (k, v) -> v == null ? new HashMap<>() : v).getOrDefault(e[2], 0);
            ans += va * vb;
            us.union(e[0], e[1]);
            mp.compute(pb, (k, v) -> v == null ? new HashMap<>() : v).put(e[2], va + vb);
        }
        return ans;
    }
}
