
import java.util.*;

class BFS {
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

        int[] queue = new int[n];

        int front = 0;
        int rear = -1;

        System.out.print("Enter starting vertex: ");
        int start = sc.nextInt();

        queue[++rear] = start;
        visited[start] = true;

        System.out.println("BFS Traversal:");

        while (front <= rear) {

            int current = queue[front++];

            System.out.print(current + " ");

            for (int i = 0; i < n; i++) {

                if (graph[current][i] == 1 && !visited[i]) {

                    visited[i] = true;
                    queue[++rear] = i;
                }
            }
        }

        sc.close();
    }
}
