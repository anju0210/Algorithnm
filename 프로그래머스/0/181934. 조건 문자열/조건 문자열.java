class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean boo = false;;
        if(n>m) boo = true;
        if(eq.equals("=")){
            if(n==m) return 1;
            else if((ineq.equals(">")&&boo)||(ineq.equals("<")&&!boo)) return 1;
        }
        else{
            if(ineq.equals(">")&&boo||(ineq.equals("<")&&!boo)) return 1;
        }
        return 0;
    }
}