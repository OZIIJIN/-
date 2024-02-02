import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


class Solution {
    public int[] solution(String today, String[] terms, String[] privacies){
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
       
        for(String term : terms){
            String[] termsArray = term.split(" ");
            map.put(termsArray[0], Integer.valueOf(termsArray[1]));
        }
        
        String[] todaydate = today.split("\\.");
        int todaytotal = Integer.parseInt(todaydate[0])*12*28 + Integer.parseInt(todaydate[1])*28 + Integer.parseInt(todaydate[2]);
        
        for(String s : privacies){
            String[] privacy = s.split(" ");
            String[] join = privacy[0].split("\\.");
            
            int daytotal = Integer.parseInt(join[0])*12*28 + (Integer.parseInt(join[1])+map.get(privacy[1]))*28 + Integer.parseInt(join[2]);
            if(todaytotal-daytotal >= 0){
                list.add("x");
            }else{
                list.add("o");
            }
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals("x")){
                answerList.add(i+1);
            }
        }
        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
