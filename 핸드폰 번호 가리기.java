class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] chararray = phone_number.toCharArray();
        String backnumber = "";
        for(int i = chararray.length - 4; i <= chararray.length - 1; i++){
            backnumber += chararray[i];
        }
        for(int i = 0; i < chararray.length -4; i++){
            answer += '*';
        }
        answer = answer + backnumber;
        return answer;
    }
}
