class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        int puls[] = {sides[1]+sides[2],sides[0]+sides[2],sides[0]+sides[1]};
        if(sides[0]>=puls[0] || sides[1]>=puls[1] || sides[2]>=puls[2]) answer = 2;
        return answer;
    }
}