class Solution {
    public int[] solution(int money) {
        int[] answer = {0,0};
        int i = 1;
        while(money>=5500){
            money -= 5500;
            answer[0]++;
        }
        answer[1] = money;
        return answer;
    }
}