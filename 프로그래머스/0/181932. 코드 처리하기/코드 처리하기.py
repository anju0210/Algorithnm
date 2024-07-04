def solution(code):
    ret = ''
    idx = -1
    mode = False
    for i in code:
        idx+=1
        if i=='1':
            mode = not mode
            continue
        if not mode and idx%2==0:
            ret += code[idx]
        elif mode and idx%2==1:
            ret += code[idx]
    if not bool(ret): return "EMPTY"
    return ret