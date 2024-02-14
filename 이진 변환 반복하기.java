class Solution {
    public int[] solution(String s) {
        int count = 0; 
        int zeroCount = 0;
        
        while(!s.equals("1")){
            StringBuilder result = new StringBuilder();
        
            // 0 제외 문자열 만들기
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if (ch != '0'){
                    result.append(ch);
                } else{
                    zeroCount ++;
                }
            }
            String output = result.toString();
            int size = output.length();
            
            //이진변환
            String binary = Integer.toBinaryString(size);   
            s = binary;
            count++;
        }
        
        int[] answer = new int[2];
        answer[0] = count;
        answer[1] = zeroCount;
        return answer;
    }
}
