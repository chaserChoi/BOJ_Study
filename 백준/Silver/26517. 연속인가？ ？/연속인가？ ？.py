import sys
k = int(sys.stdin.readline().strip())
a, b, c, d = map(int, sys.stdin.readline().split())

def f(x):
    if x <= k:
        return a * x + b
    else:
        return c * x + d
    
if a * k + b == c * k + d:
    sys.stdout.write(f"Yes {a * k + b}")
else:
    sys.stdout.write("No")