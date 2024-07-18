import sys

n = int(sys.stdin.readline().strip())

steps = 0
while n != 1:
    if n % 2 == 0:
        n //= 2
    else:
        n += 1
    steps += 1
    
sys.stdout.write(str(steps))