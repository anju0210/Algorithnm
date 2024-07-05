def solution(n):
    answer = [n]
    while not 1 in answer:
        if n%2: n=n*3+1
        else: n/=2
        answer.append(n)
    return answer