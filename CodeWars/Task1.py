def minimum(arr):
    return sorted(arr)[0]

def maximum(arr):
    return sorted(arr)[len(arr)-1]

print(minimum([1,2,3,4,5,2,1231,]))
print(maximum([1,2,3,4,5,1231,231]))