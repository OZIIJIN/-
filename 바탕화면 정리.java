import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] wallpaper) {
        int a = wallpaper.length;
        int b = wallpaper[0].length();
        char [][] array = new char[a][b];
        int cnt = 0;
        
        //2차원 배열 세팅
        for(int i = 0; i < a; i++){
            String s = wallpaper[i];
            for(int j = 0; j < b; j++){
                array[i][j] = s.charAt(j);
                if(array[i][j] == '#'){
                    cnt++;
                }
            }
        }
        //'#'인덱스 좌표 저장
        int[] xpoints = new int[cnt];
        int[] ypoints = new int[cnt];
        int zero = 0;
        for(int i = 0; i < a; i++){
            for(int j = 0;  j < b;j++){
                if(array[i][j] == '#'){
                    xpoints[zero] = i;
                    ypoints[zero] = j;
                    zero++;
                }
            }
        }
        
        //x 좌표 중 최대, 최소 구하기
        int xmin = xpoints[0];
        int xmax = xpoints[0];
        for(int i = 0; i < xpoints.length; i++){
            if(xpoints[i] > xmax){
                xmax = xpoints[i];
            } else if(xpoints[i] < xmin){
                xmin = xpoints[i];
            }
        }
        //y 좌표 중 최대, 최소 구하기
        int ymin = ypoints[0];
        int ymax = ypoints[0];
        for(int i = 0; i < ypoints.length; i++){
            if(ypoints[i] > ymax){
                ymax = ypoints[i];
            } else if(ypoints[i] < ymin){
                ymin = ypoints[i];
            }
        }
        //정답 배열 만들기
        int[] answer = new int[4];
        answer[0] = xmin;
        answer[1] = ymin;
        answer[2] = xmax + 1;
        answer[3] = ymax + 1;
        return answer;
    }
}
