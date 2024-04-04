class Solution {
    public String solution(String myString) {
        String answer = "";
        char ch[] = new char[20];
        for(int i=0; i<myString.length(); i++){
            ch[i] = myString.charAt(i);
            if(ch[i]=='a') ch[i] = 'A';
            else if(ch[i]<=90&&ch[i]>65) ch[i] += 32;
            
            answer += ch[i];
            
        }
        return answer;
    }
}