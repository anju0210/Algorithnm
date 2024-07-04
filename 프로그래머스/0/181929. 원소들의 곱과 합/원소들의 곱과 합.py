def solution(num_list):
    x = 1
    for i in num_list:
        x *= i
    if sum(num_list)**2>x: return 1
    return 0