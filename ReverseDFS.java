class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer, List<Integer>> map = constructMap(edges);
        return helper(0, map, hasApple, new HashSet<>());
    }
    
    public int helper(int node, Map<Integer, List<Integer>> map, List<Boolean> hasApple, Set<Integer> visited) {
        visited.add(node);
        int res = 0;
        if (map.containsKey(node)) {
            for (int next : map.get(node)) {
                if (!visited.contains(next)) {
                    res += helper(next, map, hasApple, visited);
                }
            }
        }
        int sum = 0;
        if (res != 0) {
            sum += res + 2;
        } else if (hasApple.get(node)) {
            sum += 2;
        }
        if (node == 0 && sum > 0) {     // we don't need to count the time when the node is root
            sum -= 2;
        }
        return sum;
    }
    
    public Map<Integer, List<Integer>> constructMap(int[][] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            if (!map.containsKey(edge[0])) {
                map.put(edge[0], new ArrayList<>());
            }
            map.get(edge[0]).add(edge[1]);
            if (!map.containsKey(edge[1])) {
                map.put(edge[1], new ArrayList<>());
            }
            map.get(edge[1]).add(edge[0]);
        }
        return map;
    }
}
