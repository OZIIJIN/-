class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        int middleNumber = charArray.length/2 - 1;
        if(charArray.length % 2 != 0){
            middleNumber += 1;
            answer = String.valueOf(charArray[middleNumber]);
        } else {
            answer = String.valueOf(charArray[middleNumber]);
            middleNumber += 1;
            answer += charArray[middleNumber];
        }
        return answer;
    }
}
