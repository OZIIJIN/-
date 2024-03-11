class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String result = Integer.toString(n, k);
        String[] arr = result.split("0");
        
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].isEmpty()){
                long num = Long.parseLong(arr[i]);
                if(isPrime(num)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    public boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}