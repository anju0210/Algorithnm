class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        int cnt = 0;
        while(!s.equals("1")){
            for(int i=0; i<s.length(); i++)
                if(s.charAt(i)=='0') answer[1]++;
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            cnt++;
        }
        answer[0] = cnt;
        return answer;
    }
}