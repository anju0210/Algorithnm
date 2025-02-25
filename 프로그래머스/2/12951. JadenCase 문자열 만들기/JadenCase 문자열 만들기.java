class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            if((i==0||s.charAt(i-1)==' ')&&(s.charAt(i)>='a'&&s.charAt(i)<='z'))
                answer += (s.substring(i, i+1)).toUpperCase();
            else if((i!=0&&s.charAt(i-1)!=' ')&&(s.charAt(i)>='A'&&s.charAt(i)<='Z'))
                answer += (s.substring(i, i+1)).toLowerCase();
            else
                answer += s.substring(i, i+1);
        }
        return answer;
    }
}