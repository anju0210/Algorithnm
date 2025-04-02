function solution(s){
    let stack = [];
    for(let ch of s){
        if(ch==')' && stack[stack.length-1]=='('){
                stack.pop();
        }
        else
            stack.push(ch);
    }

    return stack.length==0? true : false;
}