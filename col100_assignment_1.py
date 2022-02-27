#2019TT10999

rem=99 %4
#half adder 
def hadd(a,b):
    return bool((a or b) and not (a and b)), bool(a and b)

#Q1 full adder
def add(a,b,c):
    s,cin=hadd(a,b)
    sum,temp=hadd(s,c)
    cout=cin or temp
    # print(sum,cout)
    return sum,cout

#add(1,1,1)


#Q2 4-bit adder
def add4(a0,a1,a2,a3,b0,b1,b2,b3,c):
    s0,c0=add(a0,b0,c)
    s1,c1=add(a1,b1,c0)
    s2,c2=add(a2,b2,c1)
    s3,c3=add(a3,b3,c2)
    return(s0,s1,s2,s3,c3)
add4(1,1,0,1,True,True,True,False,0)

#cmp1 function for comparing a single bit using XOR unction of hadd----- 
#returns true for a>=b
def cmp1(a,b):
    s,t=hadd(a,b)
    if (s==True):
        if (bool(a)==True):
            return 1
        else:
            return 0
    else:
        return -1     

#Q3 4-bit comparator for >= as remainder is 3
def cmp(a0,a1,a2,a3, b0,b1,b2,b3):
    c3=cmp1(a3,b3)
    c2=cmp1(a2,b2)
    c1=cmp1(a1,b1)
    c0=cmp1(a0,b0)
    if (c3==1):
        return True
    elif (c3==-1 and c2==1):
        return True
    elif (c3==-1 and c2==-1 and c1==1):
        return True
    elif (c3==-1 and c2==-1 and c1==-1 and c0==1):
        return True
    elif(c3==-1 and c2==-1 and c1==-1 and c0==-1):
        return True
    else:
        return False


#Q4 4 bit subtractor
def sub4(a0,a1,a2,a3, b0,b1,b2,b3):
    # print(c0,c1,c2,c3)
    
    s0,s1,s2,s3,c=add4(a0,a1,a2,a3,not b0,not b1,not b2,not b3,1)
    if (c):
        return s0,s1,s2,s3,False
    else:
        s0,s1,s2,s3,cin=add4(1,0,0,0,not s0,not s1,not s2,not s3,0)
        cout,temp=hadd(not c,cin)
        return s0,s1,s2,s3,cout   
     
#Q5 8-bit adder
def add8(a, b, c):
    (a0,a1,a2,a3,a4,a5,a6,a7) = a
    (b0,b1,b2,b3,b4,b5,b6,b7) = b
    s0,s1,s2,s3,cin=add4(a0,a1,a2,a3,b0,b1,b2,b3,c)
    s4,s5,s6,s7,cout=add4(a4,a5,a6,a7,b4,b5,b6,b7,cin)
    s=(s0,s1,s2,s3,s4,s5,s6,s7)
    return s,cout



#Q6 4-bit multiplier
def mul4(a,b):
    x=(a[0],a[1],a[2],a[3],0,0,0,0)
    s=(0,0,0,0,0,0,0,0)
    (b0,b1,b2,b3)=b
    while(cmp(b0,b1,b2,b3,1,0,0,0)==True):
        b0,b1,b2,b3,t=sub4(b0,b1,b2,b3,1,0,0,0)
        s,c=add8(s,x,0)
    return(s)

