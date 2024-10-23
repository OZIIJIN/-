import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] toString = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            toString[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(toString, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        if(toString[0].equals("0")){
            return "0";
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < toString.length; i++) {
            answer.append(toString[i]);
        }
        
        return answer.toString();
    }
}