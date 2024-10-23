import java.util.*;
public class Main{
    static int[][] graph;
    static boolean[] visited;
    static int N; 
    static int M;
    static int answer = 0;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a][b] = graph[b][a] = 1;
        }

        dfs(1, graph);
        System.out.print(answer);
    }
    public static void dfs(int start, int[][] graph) {
        visited[start] = true;

        for(int i = 0; i <= N; i++) {
            if(graph[start][i] == 1 && visited[i] == false) {
                answer++;
                dfs(i, graph);
            }
        }
    }
}