class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] array = new int[number];
        
        for(int i = 1; i <= number; i++){
            //약수의 수 구하기
            int count = 0; 
            for(int j = 1; j * j <= i; j++){
                if(j * j == i){
                    count++;
                } else if(i % j == 0){
                    count += 2;
                }
            }
            array[i-1] = count;
        }
        
        //limit 넘은 숫자 처리하기 와 합 구하기
        for(int i = 0; i < array.length; i++){
            if(array[i] > limit){
                array[i] = power;
            }
            answer += array[i];
        }
        
        return answer;
    }
}
