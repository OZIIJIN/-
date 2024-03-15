import java.util.*;

class Solution {
    public List<String> solution(String[] players, String[] callings) {
        List<String> playersList = Arrays.asList(players);
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for(String calling : callings){
            int indx = map.get(calling);
            String temp = playersList.get(indx-1);
            playersList.set(indx-1, calling);
            playersList.set(indx, temp);
            map.put(calling, indx-1);
            map.put(temp, indx);
        }
        List<Map.Entry<String, Integer>> entrys = new ArrayList<>(map.entrySet());
        entrys.sort(Map.Entry.comparingByValue());

        List<String> answer = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entrys) {
            answer.add(entry.getKey());
        }
        return answer;
    }
}