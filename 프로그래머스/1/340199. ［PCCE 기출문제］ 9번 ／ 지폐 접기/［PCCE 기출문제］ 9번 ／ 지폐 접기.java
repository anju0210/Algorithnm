class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(max(bill)>max(wallet) || min(bill)>min(wallet)){
            bill[bill[0]>bill[1]? 0 : 1] /= 2;
            answer++;
        }
        return answer;
    }
    
    private int max(int arr[]){
        return arr[0]>arr[1]? arr[0] : arr[1];
    }
    private int min(int arr[]){
        return arr[0]>arr[1]? arr[1] : arr[0];
    }
}