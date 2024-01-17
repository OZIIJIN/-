class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long totalprice = 0;
        for (int i = 1; i<=count; i++){
            totalprice += price*i;
        }
        if(money<totalprice){
            answer = (long)Math.abs(money - totalprice);
        }
        return answer;
    }
}
