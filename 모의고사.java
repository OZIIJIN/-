import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        
        //수포자들의 정답 배열과 실제 맞힌 수의 배열
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answer = {0, 0, 0};
        
        //정답과 비교
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == answer1[i%5]){
                answer[0]++;
            }
            if(answers[i] == answer2[i%8]){
                answer[1]++;
            }
            if(answers[i] == answer3[i%10]){
                answer[2]++;
            }
        }
        
        //최댓값 찾기
        int max = answer[0];
        for(int i =1; i < answer.length; i++){
            if(max < answer[i]){
                max = answer[i];
            }
        }
        
        
        //최댓값과 동일한 수포자 리스트 생성
        List<Integer> answerpeople = new ArrayList<>();
        for(int i = 0; i < answer.length; i++){
            if(max==answer[i]){
                answerpeople.add(i+1);
            }
        }
        
        //리스트 -> 배열
        int [] result = new int[answerpeople.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = answerpeople.get(i);
        }
        return result;
    }
}
