import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 1));
        }
        return (map.size()>nums.length/2)? nums.length/2 : map.size();
    }
}