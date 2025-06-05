class Solution {
    public String solution(int[] food) {
        String answer = "";
        int len = 0;
        for(int n : food){
            len += n/2;
        }
        char ch[] = new char[len];
        int idx = 0;
        for(int i=1; i<food.length; i++){
            int n = food[i]/2;
            while(n>0){
                ch[idx++] = (char)(48+i);
                n--;
            }
        }
        
        for(char c : ch){
            answer += Character.toString(c);
        }
        answer += "0";
        for(int i=ch.length-1; i>=0; i--){
            answer += Character.toString(ch[i]);
        }
        
        return answer;
    }
}