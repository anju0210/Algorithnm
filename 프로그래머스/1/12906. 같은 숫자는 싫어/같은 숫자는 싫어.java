import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(arr[0]);
        for(int n : arr)
            if(stack.peek()!=n)
                stack.push(n);
        
        int[] answer = new int[stack.size()];
        for(int i=0; i<stack.size(); i++)
            answer[i] = stack.get(i);

        return answer;
    }
}