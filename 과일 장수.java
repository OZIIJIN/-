import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int k, int m, int[] score) {
        int appleboxCount = score.length/m; 
        List<Integer> appleScores = new ArrayList<>();
        int finalScore = 0;
        int startindex = score.length-m;
        int endindex = score.length;
        
        //score 배열에서 최솟값 구하기
        Arrays.sort(score);
        int min = score[0];
        
        //
        for(int i = 0; i < score.length; i++){
            appleScores.add(score[i]);
        }
        
        //사과박스 만들기
        for(int i = 0; i < appleboxCount; i++){
            List<Integer> appleBox = appleScores.subList(startindex, endindex);
            finalScore += appleBox.get(0)*m;
            startindex -= m;
            endindex -= m;
        }
        
        return finalScore;
    }
}
