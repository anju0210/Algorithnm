function solution(n, m) {
    var answer = [];
    let max = Math.max(n, m);
    let min = Math.min(n, m);
    let num = max%min;
    while(num!=0){
        max = min;
        min = num;
        num = max%min;
    }
    answer[0] = min;
    answer[1] = (n*m)/answer[0]
    return answer;
}