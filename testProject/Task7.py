def is_prime(x):
    count = []

    for i in range(2, (x//2)+1):
        if x % i == 0:
            count.append(i)

    return count

n = int(input())
print(" ".join(map(str, is_prime(n))))