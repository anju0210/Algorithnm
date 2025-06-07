import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int a, b, r;
        Arrays.sort(arr);
        
        if(arr[arr.length-1]==1){
            return 1;
        }
        
        for(int i=0; i<arr.length-1; i++){
            a = arr[i];
            b = arr[i+1];
            r = arr[i];
            while(b%a>0){
                r = b%a;
                b = a;
                a = r;
            }
            arr[i+1] = arr[i]*arr[i+1]/r;
        }
        
        return arr[arr.length-1];
    }
}