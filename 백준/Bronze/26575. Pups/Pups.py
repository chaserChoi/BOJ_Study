n = int(input()) 

for _ in range(n):
    d, f, p = map(float, input().split())
    total_cost = d * f * p 
    
    print(f"${total_cost:.2f}")

