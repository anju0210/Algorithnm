class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        boolean inn;
        for(int i=0; i<my_string.length(); i++){
            inn = false;
            for(int j=0; j<indices.length; j++){
                if(indices[j] == i){
                    inn = true;
                    continue;
                }
            }
            if(!inn) answer += my_string.charAt(i);
        }
        return answer;
    }
}