class Solution {
    public String solution(String s) {
        String answer = "";
        String str = s.toLowerCase();
        String[] words = str.split(" ");
        
        for(int i = 0; i < words.length; i++){
            if(words[i].length() == 0){
                answer += " "; // 단어가 공백일 경우 반환값에 공백 더하기
            }else{
                answer += words[i].substring(0,1).toUpperCase();
                answer += words[i].substring(1);
                answer += " ";
            }
        }
        //원래 문자열 마지막이 공백일 경우 그대로 answer 반환
        if(s.substring(s.length() -1, s.length()).equals(" ")) return answer;
        //마지막에 공백이 더해져서 그 공백을 제외한 answer값 반환
        return answer.substring(0, answer.length() - 1);
    }
}