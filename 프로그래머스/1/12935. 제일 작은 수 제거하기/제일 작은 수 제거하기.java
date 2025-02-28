class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int cnt = 0;
        for (int i = 1; i < arr.length; i++)
            if(min>arr[i]) min = arr[i];
        for(int i=0; i<arr.length; i++)
            if(arr[i]!=min) answer[cnt++] = arr[i];
        
        return answer.length==0? new int[]{-1} : answer;
    }
}