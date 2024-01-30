class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++){
            //먼저, 각 발음을 다른 문자로 바꾸기
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("ye", "2");
            babbling[i] = babbling[i].replace("woo", "3");
            babbling[i] = babbling[i].replace("ma", "4");
        }
        for(int i = 0; i < babbling.length; i++){
            //연속된 발음인 경우도 같은 문자로 바꾸기
            babbling[i] = babbling[i].replace("11", "0");
            babbling[i] = babbling[i].replace("22", "0");
            babbling[i] = babbling[i].replace("33", "0");
            babbling[i] = babbling[i].replace("44", "0");
            
            //공백으로 바꾸기
            babbling[i] = babbling[i].replace("1", "");
            babbling[i] = babbling[i].replace("2", "");
            babbling[i] = babbling[i].replace("3", "");
            babbling[i] = babbling[i].replace("4", "");
            
            if(babbling[i].isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}
