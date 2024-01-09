import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        for (int i = 0; i<arr.length; i++){
            int num = Character.getNumericValue(arr[i]);
            answer += num;
        }
        return answer;
    }
}
