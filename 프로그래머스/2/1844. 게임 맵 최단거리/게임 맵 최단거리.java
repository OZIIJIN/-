import java.util.*;
class Solution {
    class Point {
        public int x;
        public int y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public Queue<Point> q = new LinkedList<>();
    public int[] dx = {1, 0, -1, 0};
    public int[] dy = {0, 1, 0, -1};
    public int[][] dist;
    public boolean check;
    public int solution(int[][] maps) {
        check = false;
        dist = new int[maps.length][maps[0].length];
        dist[0][0] = 1;
        
        return move(0,0, maps);
    }
    public int move(int x, int y, int[][] maps) {
        Point p = new Point(x, y);
        q.add(p);
        maps[x][y] = 0;
        
        while(q.size() > 0) {
            Point tmp = q.poll();
            if(tmp.x == maps.length-1 && tmp.y == maps[0].length-1) {
                return dist[tmp.x][tmp.y];
            }
            
            for(int i = 0; i < 4; i++) {
                int nextX = tmp.x + dx[i];
                int nextY = tmp.y + dy[i];
                if(nextX < 0 || nextY < 0 || nextX > maps.length - 1 || nextY > maps[0].length - 1) {
                    continue;
                }
                if(maps[nextX][nextY] == 0) {
                    continue;
                } else {
                    Point nextPoint = new Point(nextX, nextY);
                    q.add(nextPoint);
                    maps[nextX][nextY] = 0;
                    dist[nextX][nextY] = dist[tmp.x][tmp.y] + 1;
                }
                
            }
        }
        return -1;
        
    }
    
}