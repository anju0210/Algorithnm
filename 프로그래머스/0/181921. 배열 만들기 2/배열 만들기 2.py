def solution(l, r):
    answer = []
    for i in range(l, r+1):
        a=0
        for j in str(i):
            if j=='0'or j=='5':
                a += 1
        if a==len(str(i)): answer.append(i)
    if not answer: answer.append(-1)
    return answer