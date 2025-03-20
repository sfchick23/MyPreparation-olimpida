def powers_of_two(n):
    res = []

    for i in range(n):
        res.append(i**2)

    return res

print(powers_of_two())