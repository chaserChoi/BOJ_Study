num1 = int(input())
num2 = int(input())

print(num1)
print(num2)

ans = num1 * num2
while num2 != 0:
    print(num1 * (num2 % 10))
    num2 = num2 // 10
    
print(ans)
