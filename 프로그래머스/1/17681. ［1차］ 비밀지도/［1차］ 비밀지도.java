class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answerArray = new String[arr1.length];
        
        String[] s1 = new String[arr1.length];
        String[] s2 = new String[arr2.length];
        
        String [][] array = new String[arr1.length][n];
        
        for(int i = 0; i < arr1.length; i++) {
            s1[i] = toBinaryString(arr1[i], n);
            s2[i] = toBinaryString(arr2[i], n);
        }
        
        for (int i = 0; i < arr1.length; i++) {
            String s = s1[i];
            char[] temp1 = s.toCharArray();
            for(int j = 0; j < temp1.length; j++) {
                if (temp1[j] == '0') {
                    array[i][j] = " ";
                } else if (temp1[j] == '1') {
                    array[i][j] = "#";
                }
            }
            String p = s2[i];
            char[] temp2 = p.toCharArray();
            for(int j = 0; j < temp2.length; j++) {
                if (temp2[j] == '1') {
                    array[i][j] = "#";
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
            String answer = "";
            for(int j = 0; j < array[0].length; j++) {
                answer += array[i][j];
            }
            answerArray[i] = answer;
        }
        

        return answerArray;
    }
    
    private String toBinaryString(int number, int n) {
        String binary = Integer.toBinaryString(number);

        return String.format("%" + n + "s", binary).replace(' ', '0');
    }
    
}