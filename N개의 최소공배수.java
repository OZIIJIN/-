class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int gcd = 0;
        int lcm = 0;
        
        if(arr.length == 1){
            return arr[0];
        }else if(arr.length == 2){
            gcd = calculateGCD(arr[0], arr[1]);
            lcm = (arr[0]*arr[1])/gcd;
            return lcm;
        }
        gcd = calculateGCD(arr[0], arr[1]);
        lcm = (arr[0]*arr[1])/gcd;
        for(int i = 2; i < arr.length; i++){
            gcd = calculateGCD(lcm, arr[i]);
            lcm = (lcm * arr[i])/gcd;
        }
        return lcm;
    }
    public int calculateGCD(int num1, int num2){
        int gcd = 0;
        
        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}
