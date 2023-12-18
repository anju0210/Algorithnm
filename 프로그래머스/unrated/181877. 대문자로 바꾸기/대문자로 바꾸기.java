class Solution {
    public String solution(String myString) {
        char ch[] = new char[myString.length()];
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            ch[i] = myString.charAt(i);
            if(ch[i]>=97) ch[i] -= (char)32;
            answer += Character.toString(ch[i]);
        }
        return answer;
    }
}