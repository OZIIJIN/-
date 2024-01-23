import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        int[] answer = new int[length];
        List<Character> list = new ArrayList<>();
        int index = 0; 
        
        for(int i = 0; i < length; i++){
            if(list.contains(charArray[i])){
                for(int j = 0; j < list.size(); j++){
                    if(list.get(j).equals(charArray[i])){
                        index = j;
                    }
                }
                list.add(charArray[i]);
                answer[i] = i - index;
            } else {
                list.add(charArray[i]);
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}
