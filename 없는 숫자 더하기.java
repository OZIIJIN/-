class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] numarray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i=0; i < numarray.length; i++){
            for(int j=0; j < numbers.length; j++){
                if(numarray[i] == numbers[j]){
                    numarray[i] = 0;
                }
            }
        }
        for(int i = 0; i < numarray.length; i++){
            answer += numarray[i];
        }
        return answer;
    }
}
