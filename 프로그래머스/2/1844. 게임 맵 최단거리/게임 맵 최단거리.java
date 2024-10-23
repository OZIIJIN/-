import java.util.*;
class Solution {
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    public int solution(int[][] maps) {
        int answer = 0;
        
        int[][] visited = new int[maps.length][maps[0].length];
        
        bfs(maps, visited);
        answer = visited[maps.length-1][maps[0].length-1];
        
        if(answer == 0) {
            return answer = -1;
        }
        
        return answer;
    }
    
    private void bfs(int[][] maps, int[][] visited) {
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        
        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            int tempX = temp[0];
            int tempY = temp[1];
            
            for(int i = 0; i < 4; i++) {
                int nextX = tempX + dx[i];
                int nextY = tempY + dy[i];
                
                if (nextX < 0 || nextX > maps.length-1 || nextY < 0 || nextY > maps[0].length-1){continue;}
                
                if(visited[nextX][nextY] == 0 && maps[nextX][nextY] == 1) {
                        visited[nextX][nextY] = visited[tempX][tempY] + 1;
                        queue.add(new int[]{nextX, nextY});
                    }
            }
        }
    }
}