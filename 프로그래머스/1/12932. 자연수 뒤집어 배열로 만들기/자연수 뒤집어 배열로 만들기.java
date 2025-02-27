class Solution {
    public int[] solution(long n) {
        int[] answer = new int[(n+"").length()];
        long ten = 10;
        for(int i=0; i<answer.length; i++){
            answer[i] = (int)(n%ten);
            n /= ten;
        }
        return answer;
    }
}