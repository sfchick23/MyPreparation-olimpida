def move_zeros(lst):
    nzn = list(filter(None, lst))
    nzn.extend([0] * (len(lst) - len(nzn)))
    return nzn

print(move_zeros([1,2,0,0,3,4,5]))