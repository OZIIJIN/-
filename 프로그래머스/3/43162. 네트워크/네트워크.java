class Solution {
    
    static boolean[] visit;
    static int answer = 0;
    
    public int solution(int n, int[][] computers) {
        visit = new boolean[n+1];
        
        for(int i = 0; i < computers.length; i++) {
            if(visit[i] == false){
                answer++;
                dfs(i, computers);
            }
         }
        
        return answer;
    }
    
    public static void dfs(int x, int[][] computers){
        visit[x] = true;
        for(int i = 0; i < computers.length; i++) {
            if(computers[x][i] == 1 && visit[i] == false) {
                dfs(i, computers);
            }
        }

    }
}