def is_prime(x):
    for i in range(2, (x//2)+1):
        if x % i == 0:
            return False
    return True
def main():
    count = 0
    for i in range(5):
        x = int(input())
        if is_prime(x):
            count += 1

    print(count)

if __name__ == '__main__':
    main()