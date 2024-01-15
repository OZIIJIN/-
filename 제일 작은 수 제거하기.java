import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        List <Integer> list = new ArrayList<>();
        for(int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        
        for(int n : arr){
            if(n != min){
                list.add(n);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return (answer.length==0) ? new int[] {-1} : answer ;
    }
}
