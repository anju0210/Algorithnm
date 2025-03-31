function solution(s)
{
    let stack = []
    for(let ch of s){
        if(stack[stack.length-1]!=ch)
            stack.push(ch);
        else
            stack.pop();
    }
    return stack.length>0? 0 : 1;
}