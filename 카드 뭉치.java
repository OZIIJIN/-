import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int length = goal.length;
        List<String> removegoal = new ArrayList<>(Arrays.asList(goal));
        List<String> cards1List = new ArrayList<>(Arrays.asList(cards1));
        List<String> cards2List = new ArrayList<>(Arrays.asList(cards2));
        
        for(int i = 0; i < length; i++){
            if(!removegoal.isEmpty() && !cards1List.isEmpty() && removegoal.get(0).equals(cards1List.get(0))){
                removegoal.remove(0);
                cards1List.remove(0);
            } else if(!removegoal.isEmpty() && !cards2List.isEmpty() && removegoal.get(0).equals(cards2List.get(0))){
                removegoal.remove(0);
                cards2List.remove(0);
            }
        }
        if(removegoal.isEmpty()){
            answer = "Yes";
        } else {
            answer = "No";
        }
        
        return answer;
    }
}
