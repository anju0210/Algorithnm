import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        int arr[] = new int[str.length()];
        for(int i=0; i<str.length(); i++)
            arr[i] = (int)(str.charAt(i))-48;
        
        Arrays.sort(arr);
        Integer[] tmp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder());
        for(int i=0; i<arr.length; i++){
            answer += arr[i]*(Math.pow(10, i));
        }
        return answer;
    }
}