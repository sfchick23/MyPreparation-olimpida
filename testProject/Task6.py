def find_divisors(N):
    divisors = []
    for i in range(1, N + 1):
        if N % i == 0:
            divisors.append(i)
    return divisors

N = int(input())

divisors = find_divisors(N)

print(" ".join(map(str, divisors)))
