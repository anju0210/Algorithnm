class Solution {
    public int solution(int[] numbers) {
        int temp[] = new int[2];
        temp[0] = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(temp[0]<numbers[i]){
                temp[1] = temp[0];
                temp[0] = numbers[i];
            }
            else if(temp[1]<numbers[i]){
                temp[1] = numbers[i];
            }
        }
        return temp[0]*temp[1];
    }
}