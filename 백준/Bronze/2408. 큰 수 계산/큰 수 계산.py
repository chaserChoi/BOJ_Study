if __name__ == '__main__':
    eq = ''
    n = int(input())
    
    for _ in range(n + n - 1):
        eq += input()
        
    eq = eq.replace('/', '//')
    
    print(eval(eq))