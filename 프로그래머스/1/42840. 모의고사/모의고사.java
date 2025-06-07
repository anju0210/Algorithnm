class Solution {
    public int[] solution(int[] answers) {
        int person[] = {0,0,0};
        int oneA = 0, twoA = 0, threeA = 3;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == ++oneA){
                person[0]++;
            }
            if(oneA==5){
                oneA = 0;
            }
            
            if(i%2==0){
                if(answers[i]==2){
                    person[1]++;
                }
            }
            else{
                if(answers[i]==++twoA){
                    person[1]++;
                }
            }
            if(twoA==1){
                twoA++;
            }
            else if(twoA==5){
                twoA = 0;
            }
            
            if(answers[i]==threeA){
                person[2]++;
            }
            if(i%2==1){
                if(threeA==3){
                    threeA = 1;
                }
                else if(threeA==2){
                    threeA = 4;
                }
                else if(threeA==5){
                    threeA = 3;
                }
                else{
                    threeA++;
                }
            }
        }
        
        int max = 0;
        
        for(int p : person){
            max = max>p? max : p;
        }
        
        int size=0;
        for(int p : person){
            if(max==p){
                size++;
            }
        }
        
        int answer[] = new int[size];
        int idx = 0;
        for(int i=0; i<person.length; i++){
            if(person[i]==max){
                answer[idx++] = i+1;
            }
        }
        
        return answer;
    }
}