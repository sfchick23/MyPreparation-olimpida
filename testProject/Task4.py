import math

w, t, T = map(int, input().split())

print(math.ceil(T / t) * w)

