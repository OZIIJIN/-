import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        //종류별 의상 HashMap에 저장
        Map<String, Integer> clothesMap = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++){
            String clothingType = clothes[i][1];
            clothesMap.put(clothingType, clothesMap.getOrDefault(clothingType, 0) + 1);
        }
        
         for(String s : clothesMap.keySet()) {
            answer *= (clothesMap.get(s) + 1);   // 조합 -> 안입는 경우도 고려하기 위해 + 1
        }
        
        answer -= 1; // 모두 '안입음'일 경우 -1 해주기 
        
        
        return answer;
    }
}