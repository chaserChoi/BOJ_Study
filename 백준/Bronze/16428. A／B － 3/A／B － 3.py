import sys

A, B = map(int, sys.stdin.readline().split())
q, r = divmod(A, B)

if r < 0:
    if B > 0:
        q -= 1
        r += B
    else:
        q += 1
        r -= B

print(q)
print(r)