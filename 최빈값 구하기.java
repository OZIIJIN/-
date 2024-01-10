import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        int maxcount = 0;
        int mode = -1;
        boolean multivalue = false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array){
            int count = map.getOrDefault(num, 0);
            map.put(num, count+1);
        }
        for ( int key : map.keySet()){
            int valuecount = map.get(key);
            if ( maxcount < valuecount){
                maxcount = valuecount;
                mode = key;
                multivalue = false;
            } else if ( valuecount == maxcount){
                multivalue = true;
            }
        }
        return multivalue ? -1 : mode;
    }
}
