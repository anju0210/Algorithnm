def solution(num_list):
    o = ''; e = ''
    for i in num_list:
        if i%2==0: o+=str(i) 
        else: e+=str(i)
    return int(o)+int(e)