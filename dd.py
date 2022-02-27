def hadd(a,b):
    #hadd(a,b) returns two bit numeral (s,c) where s is the unit digit or sum and c is the carry over
    return ((a or b) and not(a and b), a and b)

#Question 1:-

def add(a,b,c):
    #this is full adder,it takes three bits and then adds them to return a 2bit numeral
    #a,b,c are bits
    (s1,c1)=hadd(a,b)   #s1 represents unit digit and c1 represents the carry over when a and b are added
    (s2,c2)=hadd(s1,c)  #s2 will be the unit digit of add(a,b,c)
    c3=c2 or c1         #c3 is final carry over for add(a,b,c)
    return (s2,c3)

#Question2:-

def add4(a0,a1,a2,a3, b0,b1,b2,b3, c):
    #here a is a 4bit numeral (a0,a1,a2,a3)
    #b is a 4bit numeral (b0,b1,b2,b3) and c is a 1bit carry unit
    #add4 basically adds a,b and c
    (s0,c1)=add(a0,b0,c)  #the idea is to take the unit digit of sum of a0,b0,c and then add the carry over obtained to a1,b1 just like we do in normal addition
    #s0 will give us the unit digit of add(a0,b0,c) and it will be unit digit of addition of a,b and c
    #c1 is the carry over when a0,b0 and c are added
    (s1,c2)=add(a1,b1,c1)
    #s1 will be the digit at second place from last for addition of a,b and c
    (s2,c3)=add(a2,b2,c2)
    #s2 will represent third digit from last
    (s3,c4)=add(a3,b3,c3)
    #s3 will be the 4th digit from last
    #c4 is the final carry over and it will represent the fifth digit from last
    return (s0,s1,s2,s3,c4)

print(hadd(True, True))