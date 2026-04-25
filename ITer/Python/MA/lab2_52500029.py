import numpy
def Ex1():
    for i in range(50,101):
        if i %2 ==1:
            print(i)
def Ex2():
    for i in range(1500,2701):
        if i%7==0 and i%5==0:
            print(i)
def Ex3():
    for i in range(21):
        if i == 3 or i == 16:
            continue
        print(i)
def Ex4():
    #Sample numbers:
    odd =0
    even =0
    numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    for i in numbers:
        if i %2 == 0:
            even = even +1
        else:
            odd=odd +1
    print("Number of even numbers is : ",even)
    print("Number of odd numbers is : ",odd)
def Ex5():
    m=0
    for i in range(1,100):
        m = m + (i/(i+1))
    print(f"{m:.2f}")
key = int(input("Enter Exercise: "))
if key == 1:
    Ex1()
elif key == 2:
    Ex2()
elif key == 3:
    Ex3()
elif key == 4:
    Ex4()
elif key == 5:  
    Ex5()

