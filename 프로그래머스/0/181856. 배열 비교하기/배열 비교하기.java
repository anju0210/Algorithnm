import java.util.Arrays;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length==arr2.length){
            if (Arrays.stream(arr1).sum()>Arrays.stream(arr2).sum()) answer = 1;
            else if (Arrays.stream(arr2).sum()>Arrays.stream(arr1).sum()) answer = -1;
        }
        else{
            if(arr1.length>arr2.length) answer = 1;
            else if(arr2.length>arr1.length) answer = -1;
        }
        return answer;
    }
}