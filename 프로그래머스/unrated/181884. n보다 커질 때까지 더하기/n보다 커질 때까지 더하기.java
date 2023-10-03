class Solution {
    public int solution(int[] numbers, int n) {
        int i = 0, sum = 0;
        while(true){
            sum += numbers[i];
            i++;
            if(sum>n) break;
        }
        return sum;
    }
}