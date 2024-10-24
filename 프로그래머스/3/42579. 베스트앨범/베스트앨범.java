import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        
        Map<String, List<Integer>> map = new HashMap<>();
        Map<String, Integer> totalPlays = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++) {
            if(map.containsKey(genres[i])){
                map.get(genres[i]).add(i);
            }else{
                map.put(genres[i], new ArrayList<>());
                map.get(genres[i]).add(i);
            }
        }
        
        for(String key : map.keySet()){
            int total = 0;
            for(int i : map.get(key)) {
                total += plays[i];
            }
            totalPlays.put(key, total);
        }
        
        List<String> mapToGenres = new ArrayList<>();
        for(String key : map.keySet()) {
            mapToGenres.add(key);
        }
        mapToGenres.sort(((o1,o2) -> totalPlays.get(o2) - totalPlays.get(o1)));
        
        //최대 재생 수 찾기
        for(String key : mapToGenres) {
            map.get(key).sort(((o1, o2) -> plays[o2] - plays[o1]));

            if (map.get(key).size() > 0) {
                answer.add(map.get(key).get(0));
            }
            // 곡이 두 개 이상 있는 경우 두 번째 곡도 추가
            if (map.get(key).size() > 1) {
                answer.add(map.get(key).get(1));
            }
        }
        

        return answer.stream().mapToInt(i -> i).toArray();
    }
}