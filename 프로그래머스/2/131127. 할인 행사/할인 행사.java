import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        //원하는 품복과 수량을 map에 저장
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        } 
       
        for(int i = 0; i < discount.length - 9; i++){
            Map<String, Integer> dMap = new HashMap<>();
            
            for(int j = 0; j < 10; j++){
                dMap.put(discount[i + j], dMap.getOrDefault(discount[i + j], 0) + 1);
            }
            
            Boolean same = true;
            
            for(String key : map.keySet()){
                if(map.get(key) != dMap.get(key)){
                    same = false;
                    break;
                }
            }
            
            answer += same ? 1 : 0;
        }
        
        return answer;
    }
}