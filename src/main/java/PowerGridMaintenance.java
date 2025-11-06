
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class PowerGridMaintenance {

    static int[] parent, size;
    static Map<Integer, PriorityQueue<Integer>> mp = new HashMap<>();
    public static void main(String[] args)
    {
        int c = 5;
        int[][] connections = {{1,2},{2,3},{3,4},{4,5}};
        int[][]queries = {{1,3},{2,1},{1,1},{2,2},{1,2}};
        printArray(processQueries(c,connections,queries));
    }




    static int findParent(int node) {
        if (parent[node] == node) return node;
        return parent[node] = findParent(parent[node]);
    }

    static void Union(int u, int v) {
        int up = findParent(u);
        int vp = findParent(v);

        if (up == vp) return;

        if (size[up] > size[vp]) {
            size[up] += size[vp];
            parent[vp] = up;
            PriorityQueue<Integer> pqV = mp.get(vp);
            PriorityQueue<Integer> pqU = mp.get(up);
            while (!pqV.isEmpty()) pqU.offer(pqV.poll());
        } else {
            size[vp] += size[up];
            parent[up] = vp;
            PriorityQueue<Integer> pqU = mp.get(up);
            PriorityQueue<Integer> pqV = mp.get(vp);
            while (!pqU.isEmpty()) pqV.offer(pqU.poll());
        }
    }

    public static int[] processQueries(int c, int[][] connections, int[][] queries) {
        parent = new int[c];
        size = new int[c];
        boolean[] offline = new boolean[c];

        for (int i = 0; i < c; i++) {
            parent[i] = i;
            size[i] = 1;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.offer(i);
            mp.put(i, pq);
        }

        for (int[] conn : connections) {
            int u = conn[0] - 1, v = conn[1] - 1;
            Union(u, v);
        }

        List<Integer> ans = new ArrayList<>();

        for (int[] q : queries) {
            int type = q[0];
            int node = q[1] - 1;

            if (type == 1) {
                if (!offline[node]) {
                    ans.add(node + 1);
                    continue;
                }
                int par = findParent(node);
                PriorityQueue<Integer> pq = mp.get(par);
                while (!pq.isEmpty() && offline[pq.peek()]) pq.poll();
                ans.add(pq.isEmpty() ? -1 : pq.peek() + 1);
            } else {
                offline[node] = true;
            }
        }

        return ans.stream().mapToInt(i -> i).toArray();
    }

    public static void printArray(int[] result){
        for(int i: result){
            System.out.print(i+" ");
        }
    }
}




