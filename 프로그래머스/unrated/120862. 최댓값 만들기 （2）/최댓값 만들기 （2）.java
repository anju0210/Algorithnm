class Solution {
    public int solution(int[] numbers) {
        int k = 0;
        int n[] = new int[numbers.length*(numbers.length-1)];
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i==j) continue;
                n[k] = numbers[i]*numbers[j];
                k++;
            }
        }
        int answer = n[0];
        for(int i =1; i<n.length-1; i++){
            answer = (n[i]>answer)? n[i] : answer;
        }
        return answer;
    }
}