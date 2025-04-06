import java.util.*;
class Solution {
    public int solution(int n) {
        int len = 0;
        int d=1;
        while(d<=n){
            d*=3;
            len++;
        }
        
        int arr[] = new int[len];
        for(int i=0; i<arr.length; i++){
            int cnt = 0;
            d/=3;
            for(int j=1; j<=2; j++){
                if(n-d<0) break;
                n -= d;
                cnt++;
            }
            arr[i] = cnt;
        }
        
        int answer = arr[0]*1;
        for(int i=1; i<arr.length; i++){
            answer += arr[i]*Math.pow(3, i);
        }
        
        return answer;
    }
}