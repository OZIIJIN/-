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
        //전달받은 문자열 마지막이 공백일 경우
        if(s.substring(s.length() -1, s.length()).equals(" ")) return answer;
        
        //전달받은 문자열 마지막이 공백이 아닐경우 마지막 공백은 제외해야함
        return answer.substring(0, answer.length() - 1);
    }
}
