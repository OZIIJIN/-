class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(" ", -1);
        
        for(int i = 0; i<array.length; i++){
            String sko = array[i];
            char[] chararray = sko.toCharArray();
            for(int j = 0; j<chararray.length; j++){
                if(j % 2 == 0){
                    if(Character.isLowerCase(chararray[j])){
                        chararray[j] = Character.toUpperCase(chararray[j]);
                    }
                } else if(j % 2 == 1){
                    if(Character.isUpperCase(chararray[j])){
                        chararray[j] = Character.toLowerCase(chararray[j]);
                    }
                }
            }
            array[i] = String.valueOf(chararray);
        }
        answer = String.join(" ",array);
        return answer;
    }
}
