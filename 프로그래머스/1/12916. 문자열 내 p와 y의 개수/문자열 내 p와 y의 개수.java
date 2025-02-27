import java.util.*;
class Solution {
    boolean solution(String s) {
        List<String> list = Arrays.asList(s.split(""));
        int countP = Collections.frequency(list, "p")
                + Collections.frequency(list, "P");
        int countY = Collections.frequency(list, "y")
                + Collections.frequency(list, "Y");
        return countP==countY? true : false;
        
    }
}