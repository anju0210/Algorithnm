def solution(a, b):
    s1 = str(a)+str(b)
    s2 = str(b)+str(a)
    if int(s1)>int(s2): return int(s1)
    return int(s2)