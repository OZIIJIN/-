class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        //초기 2차원 배열 세팅
        char[][] array = new char[park.length][];
        for (int i = 0; i < array.length; i++){
            array[i] = park[i].toCharArray();
        }
        
        //초기 위치
        int Sx = 0;
        int Sy = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0 ; j < array[0].length; j++){
                if(array[i][j] == 'S'){
                    Sy = i;
                    Sx = j;
                    break;
                }
            }
        }
        
        //routes
        for(int i = 0; i < routes.length; i++){
            String[] route = routes[i].split(" ");
            int direct = Integer.parseInt(route[1]);
            boolean check = true;
            if(route[0].equals("E")){
                if(Sx + direct < array[0].length){
                    for(int j = Sx; j <= Sx+direct; j++){
                        if(array[Sy][j] == 'X'){
                            check = false;
                            break;
                        }
                    }
                    if(check){
                        Sx += direct;
                    }
                }
            }else if(route[0].equals("W")){
                if(Sx - direct >= 0){
                    for(int j = Sx; j >= Sx-direct; j--){
                        
                        if(array[Sy][j] == 'X'){
                            check = false;
                            break;
                        }
                    }
                    if(check){
                        Sx -= direct;
                    }
                }
            }else if(route[0].equals("N")){
                if(Sy - direct >= 0){
                    for(int j = Sy; j >= Sy-direct; j--){
                        
                        if(array[j][Sx] == 'X'){
                            check = false;
                            break;
                        }
                    }
                    if(check){
                        Sy -= direct;
                    }
                }
            }else if(route[0].equals("S")){
                if(Sy + direct < array.length){
                    for(int j = Sy; j <= Sy+direct; j++){
                        
                        if(array[j][Sx] == 'X'){
                            check = false;
                            break;
                        }
                    }
                    if(check){
                        Sy += direct;
                    }
                }
            }
        }
        
        
        int[] answer = new int[2];
        answer[0] = Sy;
        answer[1] = Sx;
        return answer;
    }
}
