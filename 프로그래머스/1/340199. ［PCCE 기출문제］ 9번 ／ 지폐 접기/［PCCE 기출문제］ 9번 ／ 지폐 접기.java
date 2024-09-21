class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int walMin = wallet[0]>wallet[1]? wallet[1] : wallet[0];
        int walMax = wallet[0]>wallet[1]? wallet[0] : wallet[1];
        int bilMin = bill[0]>bill[1]? bill[1] : bill[0];
        int bilMax = bill[0]>bill[1]? bill[0] : bill[1];
        
        while(bilMin>walMin || bilMax>walMax){
            if(bill[0]>bill[1]) bill[0] /= 2;
            else bill[1] /= 2;
            bilMin = bill[0]>bill[1]? bill[1] : bill[0];
            bilMax = bill[0]>bill[1]? bill[0] : bill[1];
            
            answer++;
        }
        return answer;
    }
}