
import java.util.Scanner;

class DFS {

    static void dfs(int[][] graph, boolean[] visited,
                    int vertex, int n) {

        // Mark vertex as visited
        visited[vertex] = true;

        System.out.print(vertex + " ");

        // Visit adjacent vertices
        for (int i = 0; i < n; i++) {

            if (graph[vertex][i] == 1 &&
                !visited[i]) {

                dfs(graph, visited, i, n);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v):");

        for (int i = 0; i < e; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        boolean[] visited = new boolean[n];

        System.out.print("Enter starting vertex: ");
        int start = sc.nextInt();

        System.out.println("DFS Traversal:");

        dfs(graph, visited, start, n);

        sc.close();
    }
}
