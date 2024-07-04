def solution(arr, queries):
    pre = []
    answer = []
    for i, j, k in queries:
        pre.clear()
        for a in range(i,j+1):
            pre.append(arr[a])
            if arr[a]<=k: pre.remove(arr[a])
        if not pre : pre.append(-1)
        answer.append(min(pre))
    return answer