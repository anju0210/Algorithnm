class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch==' '){
                answer += Character.toString(' ');
            }
            else if(ch<91&&ch+n>90){
                answer += Character.toString('A'-1+n-(90-ch));
            }
            else if(ch<123&&ch+n>122){
                answer += Character.toString('a'-1+n-(122-ch));
            }
            else{
                answer += Character.toString(ch+n);
            }
        }
        return answer;
    }
}