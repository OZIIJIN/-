import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 참가자 이름과 인원 수를 저장하는 HashMap 생성
        Map<String, Integer> map = new HashMap<>();
        
        // 참가자 명단을 HashMap에 저장 (이름이 중복될 경우 인원 수를 증가시킴)
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // 완주자 명단을 HashMap에서 제거 (인원 수를 감소시킴)
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 남은 인원이 1명인 참가자가 완주하지 못한 사람
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                answer = key;
                break;
            }
        }
        
    
        return answer;
    }
}