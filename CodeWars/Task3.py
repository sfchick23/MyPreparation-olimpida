def sale_hotdogs(n):
    if n == 0:
        return 0

    price = 0

    if n < 5:
        price += n * 100
    elif 5 <= n < 10:
        price += n * 95
    elif n >= 10:
        price += n * 90

    return price


