import sys
from math import sqrt, pi

input = sys.stdin.readline
print = sys.stdout.write

L = int(input().strip())

print(f"{(sqrt(3) / 4 * L ** 2):.9f}")
