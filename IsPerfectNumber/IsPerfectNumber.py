def is_perfect(number):
    if number < 2:
        return False

    total_sum = 1

    for i in range(2, int(number**0.5) + 1):
        if number % i == 0:
            total_sum += i
            if i != number // i:
                total_sum += number // i

    return total_sum == number

def main():
    start = int(input())
    end = int(input())

    found = False

    for i in range(start, end + 1):
        if is_perfect(i):
            found = True
            print(i)

    if not found:
        print("В заданном интервале нет совершенных чисел.")

if __name__ == "__main__":
    main()
