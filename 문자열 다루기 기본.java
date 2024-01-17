class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] array = s.toCharArray();
        if (array.length == 4 || array.length == 6){
            for (char c : array){
                answer = Character.isDigit(c);
                if(answer == false){
                    break;
                }
            }
            
        }  else {
            answer = false;
        }
        return answer;
    }
}
