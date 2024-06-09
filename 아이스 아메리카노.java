class Solution {
    public int[] solution(int money) {
        
        int americano = money/5500;
        int remain = money - americano*5500;
        
        int[] answer = new int [] {americano, remain};
        return answer;
    }
}
