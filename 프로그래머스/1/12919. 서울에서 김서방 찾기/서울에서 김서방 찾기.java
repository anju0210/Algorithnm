class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int n = 0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                n = i;
                break;
            }
        }
        answer = "김서방은 "+Integer.toString(n)+"에 있다";
        return answer;
    }
}