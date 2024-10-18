while True:
    str = input().split()
    
    if str[0] == "0":
        break
        
    line = str[1:]
    ans = ""
    
    for i in range(1, int(str[0])):
        if line[i] != line[i-1]:
            ans += line[i] + " "
            
    print(f"{str[1]} {ans}$")
