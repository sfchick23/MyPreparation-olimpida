# n = int(input())
# p = []
# d = 2
# while d <= n:
#     if n % d == 0:
#         p.append(d)
#         n /= d
#     else:
#         d += 1
#
#
# print(p)


import math


def max_prime_factor_power(N):
    max_power = 0
    for i in range(2, int(math.sqrt(N)) + 1):
        power = 0
        while N % i == 0:
            N //= i
            power += 1
        max_power = max(max_power, power)

    if N > 1:
        max_power = max(max_power, 1)

    return max_power


N = int(input())
print(max_prime_factor_power(N))