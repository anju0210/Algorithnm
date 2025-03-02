class Solution {
    public int solution(int n) {
        int num = n+1;
        String str = Integer.toBinaryString(n).replace("0", ""), s;
        while(true){
            s = Integer.toBinaryString(num).replace("0", "");
            if(str.length()==s.length()) return num;
            else num++;
        }
    }
}