import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        
        List<Integer> numbers = Arrays.stream(s.split(" "))
            .map(Integer :: parseInt)
            .collect(Collectors.toList());
        
        Collections.sort(numbers);
        
        String answer = numbers.get(0).toString() + " " + numbers.get(numbers.size() -1).toString();

        return answer;
    }
}