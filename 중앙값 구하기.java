class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int length = array.length;
        int m = array.length / 2;
        for ( int i = 0; i < length -1; i++ ){
            for ( int j = 0; j < length-i-1; j++){
                if ( array[j] > array[j+1] ){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        answer = array[m];
        return answer;
    }
}
