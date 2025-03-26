function solution(t, p) {
    var answer = 0;
    let pLen = p.length;
    for(let i=0; i<t.length-pLen+1; i++){
        if(parseInt(t.substr(i,pLen))<=parseInt(p)) answer++;
    }
    return answer;
}