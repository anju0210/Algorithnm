class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[] = s.split(" ");
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            String sub = s.substring(i, i+1);
            if(sub.equals(" ")){
                answer += " ";
                cnt = 0;
            }
            else{
                if(cnt%2==0)
                    answer += sub.toUpperCase();
                else
                    answer += sub.toLowerCase();
                cnt++;
            }
        }
        return answer;
    }
}