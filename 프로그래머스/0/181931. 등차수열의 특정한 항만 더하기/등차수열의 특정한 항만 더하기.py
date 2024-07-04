def solution(a, d, included):
    ad = list(range(a, a+len(included)*d, d))
    answer = 0
    for i in range(len(ad)):
        if included[i]: answer += ad[i]
    return answer