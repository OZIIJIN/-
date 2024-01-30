class Solution {
    public String solution(String X, String Y) {
       
        int[] xCnt = new int[10];
        int[] yCnt = new int[10];
        StringBuilder stringBuilder = new StringBuilder();
        
        for(String x : X.split("")){
            xCnt[Integer.parseInt(x)]++;
        }
        for(String y : Y.split("")){
            yCnt[Integer.parseInt(y)]++;
        }
        for(int i = 9; i >= 0; i--){
            while(xCnt[i] > 0 && yCnt[i] > 0){
                stringBuilder.append(i);
                xCnt[i]--;
                yCnt[i]--;
            }
        }
        if(stringBuilder.toString().equals("")){
            return "-1";
        }else if(stringBuilder.toString().substring(0,1).equals("0")){
            return "0";
        }else{
            return stringBuilder.toString();
        }   
    }
}
