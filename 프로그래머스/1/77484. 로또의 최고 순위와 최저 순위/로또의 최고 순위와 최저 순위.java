class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zerocnt = 0;
        
        //0을 제외하고 당첨 번호와 일치하는 숫자 세기
        for(int number1 : lottos){
            for(int number2 : win_nums){
                if(number1 == number2){
                    cnt++;
                }
            }
            if(number1 == 0){
                zerocnt++;
            }
        }
        
        //최고순위는 0이 원래의 당첨 번호인 경우, 최저순위는 0이 다 당첨 번호가 아닌 경우
        int highcnt = cnt + zerocnt;
        int lowcnt = cnt;
        
        
        int highrank = 0;
        int lowrank = 0;
        //순위매기기
        if(highcnt == 6){
            highrank = 1;
        } else if(highcnt ==5){
            highrank = 2;
        } else if(highcnt ==4){
            highrank = 3;
        } else if(highcnt ==3){
            highrank = 4;
        } else if (highcnt ==2){
            highrank = 5;
        } else {
            highrank = 6;
        }
        
        if(lowcnt == 6){
            lowrank = 1;
        } else if(lowcnt ==5){
            lowrank = 2;
        } else if(lowcnt ==4){
            lowrank = 3;
        } else if(lowcnt ==3){
            lowrank = 4;
        } else if (lowcnt ==2){
            lowrank = 5;
        } else {
            lowrank = 6;
        }
        
        answer[0] = highrank;
        answer[1] = lowrank;
        return answer;
    }
}