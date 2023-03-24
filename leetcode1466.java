import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

class Solution {

    ArrayList<Integer> [] lists;
    HashSet<Pair> edged;

    int ans=0;

    void dfs(int node,int parent){

        for(int i:lists[node]){

            if(i==parent)
                continue;

            if(!edged.contains(new Pair(i,node))) {
                // System.out.println(node+" "+i);
                ans++;
            }

            dfs(i,node);
        }
    }


    public int minReorder(int n, int[][] connections) {

        lists = new ArrayList[n];

        edged = new HashSet<>();

        for(int i=0;i<n;++i){
            lists[i] = new ArrayList<>();
        }

        for(int i=0;i<connections.length;++i){

            lists[connections[i][0]].add(connections[i][1]);
            lists[connections[i][1]].add(connections[i][0]);

            edged.add(new Pair(connections[i][0],connections[i][1]));
        }

        dfs(0,-1);

        return ans;


    }

    class Pair{
        int u,v;

        public Pair(int u, int v) {
            this.u = u;
            this.v = v;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair pair = (Pair) o;
            return u == pair.u &&
                    v == pair.v;
        }

        @Override
        public int hashCode() {
            return Objects.hash(u, v);
        }
    }
}
