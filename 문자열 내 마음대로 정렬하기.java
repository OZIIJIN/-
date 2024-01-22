import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        for(int i = 0; i < strings.length; i++){
            String s = strings[i].substring(n, n+1);
            strings[i] = s + strings[i];
        }
        Arrays.sort(strings);
        for(int i = 0; i< strings.length; i++){
            strings[i] = strings[i].substring(1);
        }
        return strings;
    }
}
