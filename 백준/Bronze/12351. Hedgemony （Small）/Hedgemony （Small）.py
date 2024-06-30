import sys
input = sys.stdin.readline

T = int(input())

for case in range(1, T+1):
    N = int(input())
    h = list(map(int, input().split()))
    
    for i in range(1, N-1):
        avg = (h[i-1] + h[i+1]) / 2
        if h[i] > avg:
            h[i] = avg
            
    print(f"Case #{case}: {h[-2]:.6f}")