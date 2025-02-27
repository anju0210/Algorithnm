import java.util.*;
class Solution {
    boolean solution(String s) {
        List<String> list = Arrays.asList(s.toUpperCase().split(""));
        int countP = Collections.frequency(list, "P");
        int countY = Collections.frequency(list, "Y");
        return countP==countY? true : false;
        
    }
}