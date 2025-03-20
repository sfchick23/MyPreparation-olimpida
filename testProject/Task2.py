def count_stops(N):
    snack_stops = N // 17

    drink_stops = N // 13
    total_stops = snack_stops + drink_stops
    return total_stops

N = int(input())
print(count_stops(N))
