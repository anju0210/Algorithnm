class Solution {
    public String[] solution(String[] strings, int n) {
        int i, j;
        for(i=1; i<strings.length; i++){
            String key = strings[i];
            char ch = key.charAt(n);
            for(j=i-1; j>=0; j--){
                if(ch<strings[j].charAt(n)||
                    (ch==strings[j].charAt(n)&&key.compareTo(strings[j])<0)){
                    strings[j+1] = strings[j];
                }
                else{
                    break;
                }
            }
            strings[j+1] = key;
        }
        return strings;
    }
}