T=int(input())
for i in range(T):
    a=int(input().split(" "))
    b=(input().split(" "))
    if(b==1):
        print("NO")
    else:
        print("YES")
        # print(f"{a} {a*b} {a*b+a}")
        print(a)
        print(" ")
        print(a*b)
        print(" ")
        print(a*b-a)