def factorial(N):
    if N == 0:
        return 1
    result = 1
    for i in range(1, N + 1):
        result *= i
    return result

N = int(input())
print(factorial(N))