import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                String s = keymap[i].substring(j, j+1);
                if(map.containsKey(s)){
                    if(map.get(s)>j+1){
                        map.replace(s, j+1);
                    }
                }
                else{
                    map.put(s, j+1);
                }
            }
        }
        
        for(int i=0; i<targets.length; i++){
            for(String s : targets[i].split("")){
                if(!map.containsKey(s)){
                    answer[i] = -1;
                    break;
                }
                answer[i] += map.get(s);
            }
        }
        return answer;
    }
}