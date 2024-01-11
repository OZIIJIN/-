class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        int evenOrodd = 0;
        
        while(num!=1){
            count += 1;
            evenOrodd = num%2;
            if (count == 500){
                break;
            }
            switch(evenOrodd){
                case 0: num /= 2;
                    break;
                case 1: num = (num*3) + 1;
                    break;
            }
        }
        if(count == 500){
            answer = -1;
        } else {
            answer = count;
        }
        return answer;
    }
}
