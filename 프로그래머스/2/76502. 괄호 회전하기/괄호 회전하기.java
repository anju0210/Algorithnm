import java.util.Stack;
import java.util.ArrayList;
class Solution {
    public int solution(String s) {
        int cnt = 0;
        ArrayList<Character> list = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            
            list.add(s.charAt(i));
        }
        
        for(int i=0; i<s.length(); i++){
            Stack<Character> check = new Stack<>();
            for(int j=0; j<list.size(); j++){
                char ch = list.get(j);
                if(!check.isEmpty()){
                    if((check.peek()=='('&&ch==')')
                      || (check.peek()=='{'&&ch=='}')
                      || (check.peek()=='['&&ch==']')){
                        check.pop();
                    }
                    else{
                        check.push(ch);
                    }
                }
                else{
                    check.push(ch);
                }
            }
            if(check.isEmpty()){
                cnt++;
            }
            list.add(list.get(0));
            list.remove(0);
        }
        return cnt;
    }
}