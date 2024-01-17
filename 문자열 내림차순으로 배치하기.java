import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        char[] charReverse = new char[charArray.length];

        for(int i = charArray.length-1; i>=0; i--){
            charReverse[charArray.length-i-1] = charArray[i];
        }
        answer = String.valueOf(charReverse);
        
        return answer;
    }
}
