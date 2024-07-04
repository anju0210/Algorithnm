def solution(num_list):
    x = 1
    for i in num_list:
        x *= i
    return int(sum(num_list)**2>x)