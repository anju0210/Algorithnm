class Solution {
    public int solution(int a, int b, int c) {
        if(a!=b&&a!=c&&b!=c) return a+b+c;
        else if(a==b&&a==c&&b==c) return (a+b+c)*((a*a)+(c*c)+(b*b))*((a*a*a)+(c*c*c)+(b*b*b));
        else return (a+b+c)*((a*a)+(c*c)+(b*b));
    }
}