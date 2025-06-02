class Solution {
    int cnt = 0;
    public int solution(int[] number) {
        dfs(0, 0, new boolean[number.length], number);
        return cnt;
    }
    
    public void dfs(int depth, int n, boolean[] visited, int[] number){
        if(depth==3){
            int sum = 0;
            for(int i=0; i<number.length; i++){
                if(visited[i]){
                    sum += number[i];
                }
            }
            if(sum==0){
                cnt++;
            }
            return;
        }
        
        for(int i=n; i<number.length; i++){
            if(visited[i]) continue;
            visited[i] = true;
            dfs(depth+1, i+1, visited, number);
            visited[i] = false;
        }
    }
}