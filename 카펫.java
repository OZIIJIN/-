import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int brown, int yellow) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= yellow; i++){
            if(yellow%i == 0){
                list.add(i);
            }
        }
        
        int[] answer = new int[2];
        
        for(int i = list.size()/2; i < list.size(); i++){
            int width = list.get(i);
            int length = yellow/width;
            if(((width+2)*2 + length*2)==brown){
                answer[0] = width+2;
                answer[1] = length+2;
            }
        }
        return answer;
    }
}
