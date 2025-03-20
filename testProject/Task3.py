n, k = map(int, input().split())
if n == k:
    print(0)
print(abs( (k - n) - n))