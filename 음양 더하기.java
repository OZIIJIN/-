import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        List<Character> signList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        
        for(boolean b : signs){
            if(b==true){
                signList.add('+');
            } else if(b==false){
                signList.add('-');
            }
        }
        for(int i = 0; i<absolutes.length; i++){
            String s = signList.get(i) + String.valueOf(absolutes[i]);
            int n = Integer.parseInt(s);
            intList.add(n);
        }
        for(int i = 0; i<intList.size(); i++){
            answer += intList.get(i);
        }
        return answer;
    }
}
