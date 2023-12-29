class Solution {
    public String solution(String my_string) {
        String answer = "";
        char ch[] = my_string.toCharArray();
        for(int i=0; i<ch.length; i++){
            switch (ch[i]){
                case 'a': case 'e': case 'i': case 'o': case 'u': continue;
            }
            answer += ch[i];
        }
        return answer;
    }
}