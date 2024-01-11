class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int number = 0;
        
        String s = String.valueOf(x);
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++){
            number += Character.getNumericValue(arr[i]);
        }
        if (x%number == 0){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
