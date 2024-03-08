import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> ingredientList = new ArrayList<>();
        
        for(int i : ingredient){
            ingredientList.add(i);
            
            if(ingredientList.size() >= 4){
                if(ingredientList.get(ingredientList.size()-4) == 1 && ingredientList.get(ingredientList.size()-3) == 2 && ingredientList.get(ingredientList.size()-2) == 3 && ingredientList.get(ingredientList.size()-1) == 1){
                    answer ++;
                    ingredientList.remove(ingredientList.size()-4);
                    ingredientList.remove(ingredientList.size()-3);
                    ingredientList.remove(ingredientList.size()-2);
                    ingredientList.remove(ingredientList.size()-1);
                }
            }
        }
        
        return answer;
    }
}