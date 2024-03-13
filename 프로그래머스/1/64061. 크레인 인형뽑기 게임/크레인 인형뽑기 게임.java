import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        
        for(int n : moves) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][n-1] != 0) {
                    if(!basket.isEmpty() && basket.peek() == board[j][n-1]) {
                        basket.pop();
                        answer++;
                    } else {
                        basket.push(board[j][n-1]);
                    }
                    board[j][n-1] = 0;
                    break;
                    
                }
            }
        }
        
        
        
        return 2*answer;
    }
}