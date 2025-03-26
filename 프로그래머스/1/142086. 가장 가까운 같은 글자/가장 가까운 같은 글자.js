function solution(s) {
    var answer = [];
    let obj = {};
    for(let i=0; i<s.length; i++){
        if(obj[s[i]]!=null) answer[i] = i-obj[s[i]];
        else answer[i] = -1;
        obj[s[i]] = i;
    }
    return answer;
}