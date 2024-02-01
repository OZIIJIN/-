import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i = 0; i < survey.length; i++){
            int choice = choices[i];
            
            if(choice > 0 && choice < 4){
                char c = survey[i].charAt(0);
                map.put(c, map.getOrDefault(c, 0) + 4 - choice);
            }else if(choice > 4){
                char c = survey[i].charAt(1);
                map.put(c, map.getOrDefault(c, 0) + choice - 4);
            }
        }
        
        stringBuilder.append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T');
        stringBuilder.append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F');
        stringBuilder.append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M');
        stringBuilder.append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N');
        
        answer = stringBuilder.toString();
        return answer;
    }
}
