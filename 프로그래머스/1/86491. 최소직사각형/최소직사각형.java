import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int min[] = new int[sizes.length];
        int max[] = new int[sizes.length];
        
        for(int i=0; i<sizes.length; i++){
            min[i] = sizes[i][0] < sizes[i][1]? sizes[i][0] : sizes[i][1];
            max[i] = sizes[i][0] > sizes[i][1]? sizes[i][0] : sizes[i][1];
        }
        
        Arrays.sort(min);
        Arrays.sort(max);
        
        return min[sizes.length-1]*max[sizes.length-1];
    }
}