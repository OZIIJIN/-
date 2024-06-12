class Solution {
    public String solution(String rsp) {
        
        char [] arr = rsp.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '2') {
                arr[i] = '0';
            } else if (arr[i] == '0') {
                arr[i] = '5';
            } else {
                arr[i] = '2';
            }
        }
        
        String answer = String.valueOf(arr);
        return answer;
    }
}