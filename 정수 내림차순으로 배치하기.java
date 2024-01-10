import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        String stranswer = "";
        long answer = 0;
        String str = String.valueOf(n);
        char[] charArray = str.toCharArray();
        List<Integer> intarr = new ArrayList<>();
        for (char c : charArray){
            int num = Character.getNumericValue(c);
            intarr.add(num);
        }
        intarr.sort(Comparator.reverseOrder());
        for (Integer a : intarr){
            stranswer += a;
        }
        answer = Long.parseLong(stranswer);
        return answer;
    }
}
