def solution(a, b):
    s1 = str(a)+str(b)
    if int(s1)>(2*a*b): return int(s1)
    return 2*a*b