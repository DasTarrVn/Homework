import math
import numpy as np
import matplotlib.pyplot as plt
import sympy as sp

def a(x):
    return math.sqrt(x)
def b(x):
    return math.pow(x, 1/3)
def c(x):
    return math.pow(x, 2/3)
def d(x):
    return (x**3)/3 - (x**2)/2 - 2*x + 1/3
def e(x):
    return (2*(x**2)-3)/(7*x + 4)
def f(x):
    return (5*(x**2) + 8*x - 3)/(3*(x**2)+2)
def g(x):
    return math.sin(x)
def h(x):
    return math.cos(x)
def i(x):
    return 3**x
def j(x):
    return 10**(-x)
def k(x):
    return math.e**x
def l(x):
    return math.log2(x)
def m(x):
    return math.log10(x)
def n(x):
    return math.log(x)

def Ex1():
    x = int(input("Enter x: "))
    print("a = ", a(x))
    print("b = ", b(x))
    print("c = ", c(x))
    print("d = ", d(x))
    print("e = ", e(x))
    print("f = ", f(x))
    print("g = ", g(x))
    print("h = ", h(x))
    print("i = ", i(x))
    print("j = ", j(x))
    print("k = ", k(x))
    print("l = ", l(x))
    print("m = ", m(x))
    print("n = ", n(x))

def a2():
    x = np.arange(-2, 2.1, 0.1)
    y = 2 + (x**2)/((x**2) + 4)
    y_max = np.max(y)
    y_min = np.min(y)
    print("max = ", y_max)
    print("min = ",y_min)

def b2():
    x = np.arange(0, 5.1, 0.1)
    y = np.sqrt(5*x + 10)
    y_max = np.max(y)
    y_min = np.min(y)
    print("max = ", y_max)
    print("min = ",y_min)

def c2():
    x = np.arange(5, 10.1, 0.1)
    y = 2/(x**2 - 16)
    y_max = np.max(y)
    y_min = np.min(y)
    print("max = ", y_max)
    print("min = ",y_min)

def d2():
    x = np.arange(-3, 3.1, 0.1)
    y = x**4 + 3*x**2 -1
    y_max = np.max(y)
    y_min = np.min(y)
    print("max = ", y_max)
    print("min = ",y_min)

def e2():
    x = np.arange(-3, 3.1, 0.1)
    y = np.where(x >= 0, x, -x)
    y_max = np.max(y)
    y_min = np.min(y)
    print("max = ", y_max)
    print("min = ",y_min)

def Ex2():
    print("a)")
    a2()
    print("b)")
    b2()
    print("c)")
    c2()
    print("d)")
    d2()
    print("e)")
    e2()

def f1(x):
    return x + 5

def f2(x):
    return x**2 - 3

def Ex3():
    print("a) f1(f2(0)) =", f1(f2(0)))
    print("b) f2(f1(0)) =", f2(f1(0)))
    print("c) f1(f1(-5)) =", f1(f1(-5)))
    print("d) f2(f2(2)) =", f2(f2(2)))

import numpy as np

def analyze(x, y):
    dy = np.diff(y)
    inc = np.any(dy > 0)
    dec = np.any(dy < 0)
    return inc, dec


# (i) f(x) = -x^3
def f_i():
    x = np.linspace(-5, 5, 1000)
    y = -x**3
    return analyze(x, y)


# (j) f(x) = -1/x^2
def f_j():
    x1 = np.linspace(-5, -0.01, 500)
    x2 = np.linspace(0.01, 5, 500)
    inc1, dec1 = analyze(x1, -1/x1**2)
    inc2, dec2 = analyze(x2, -1/x2**2)
    return (inc1 or inc2), (dec1 or dec2)


# (k) f(x) = -1/x
def f_k():
    x1 = np.linspace(-5, -0.01, 500)
    x2 = np.linspace(0.01, 5, 500)
    inc1, dec1 = analyze(x1, -1/x1)
    inc2, dec2 = analyze(x2, -1/x2)
    return (inc1 or inc2), (dec1 or dec2)


# (l) f(x) = 1/|x|
def f_l():
    x1 = np.linspace(-5, -0.01, 500)
    x2 = np.linspace(0.01, 5, 500)
    inc1, dec1 = analyze(x1, 1/np.abs(x1))
    inc2, dec2 = analyze(x2, 1/np.abs(x2))
    return (inc1 or inc2), (dec1 or dec2)


# (m) f(x) = sqrt(|x|)
def f_m():
    x1 = np.linspace(-5, 0, 500)
    x2 = np.linspace(0, 5, 500)
    inc1, dec1 = analyze(x1, np.sqrt(np.abs(x1)))
    inc2, dec2 = analyze(x2, np.sqrt(np.abs(x2)))
    return (inc1 or inc2), (dec1 or dec2)


# (n) f(x) = sqrt(-x)
def f_n():
    x = np.linspace(-5, 0, 500)
    y = np.sqrt(-x)
    return analyze(x, y)


def Ex4():
    funcs = [
        ("(i)  f(x) = -x^3", f_i()),
        ("(j)  f(x) = -1/x^2", f_j()),
        ("(k)  f(x) = -1/x", f_k()),
        ("(l)  f(x) = 1/|x|", f_l()),
        ("(m)  f(x) = sqrt(|x|)", f_m()),
        ("(n)  f(x) = sqrt(-x)", f_n()),
    ]

    for name, (inc, dec) in funcs:
        print(name)
        if inc:
            print("  Increasing on some interval")
        if dec:
            print("  Decreasing on some interval")
        print()

def Ex5():
    import numpy as np

    # Domain
    x = np.linspace(-2, 2, 1000)

    # f1(x) = sqrt(1 - (|x| - 1)^2)
    f1_inside = 1 - (np.abs(x) - 1)**2
    f1 = np.sqrt(np.maximum(f1_inside, 0))

    # f2(x) = -3 * sqrt(1 - sqrt(|x|/2))
    f2_inside = 1 - np.sqrt(np.abs(x) / 2)
    f2 = -3 * np.sqrt(np.maximum(f2_inside, 0))

    # Plot
    plt.figure()
    plt.plot(x, f1, color='magenta', label='f1(x)')
    plt.plot(x, f2, color='red', label='f2(x)')
    plt.axhline(0)
    plt.axvline(0)
    plt.legend()
    plt.grid(True)
    plt.show()

def Ex6():
    import numpy as np
    import matplotlib.pyplot as plt

    # (a) f(x) = x^2 + k
    x = np.linspace(-10, 10, 1000)
    plt.figure()
    plt.plot(x, x**2, label="f(x)=x^2")
    for k in [2, 4, 6, 8, 10, 12]:
        plt.plot(x, x**2 + k, label=f"x^2+{k}")
    plt.legend(); plt.title("(a)"); plt.grid(); plt.show()

    #(b) f(x) = (x+k)^2
    plt.figure()
    plt.plot(x, x**2, label="f(x)=x^2")
    for k in [2, 4, 6, 8, 10, 12]:
        plt.plot(x, (x + k)**2, label=f"(x+{k})^2")
    plt.legend(); plt.title("(b)"); plt.grid(); plt.show()

    #(c) f(x) = k*sqrt(x)
    x = np.linspace(1, 50, 1000)
    plt.figure()
    plt.plot(x, np.sqrt(x), label="sqrt(x)")
    for k in [1/3, 1, 3, 6]:
        plt.plot(x, k*np.sqrt(x), label=f"{k}*sqrt(x)")
    plt.legend(); plt.title("(c)"); plt.grid(); plt.show()

    # (d) f(x)=x^3, left 1, down 1
    x = np.linspace(-5, 5, 1000)
    plt.figure()
    plt.plot(x, x**3, label="x^3")
    plt.plot(x, (x+1)**3 - 1, label="(x+1)^3 - 1")
    plt.legend(); plt.title("(d)"); plt.grid(); plt.show()

    #(e) f(x)=x^(2/3), right 1, down 1
    plt.figure()
    plt.plot(x, np.cbrt(x**2), label="x^(2/3)")
    plt.plot(x, np.cbrt((x-1)**2) - 1, label="(x-1)^(2/3) - 1")
    plt.legend(); plt.title("(e)"); plt.grid(); plt.show()

    # (f) f(x)=1/2(x+1)+5, down 5, right 1
    plt.figure()
    plt.plot(x, 0.5*x, label="1/2 x")
    plt.plot(x, 0.5*(x-1)+5-5, label="1/2(x-1)")
    plt.legend(); plt.title("(f)"); plt.grid(); plt.show()

    # (g) f(x)=1/x^2, left 2, down 1
    x = np.linspace(-5, -0.1, 500)
    x2 = np.linspace(0.1, 5, 500)
    plt.figure()
    plt.plot(x, 1/x**2); plt.plot(x2, 1/x2**2, label="1/x^2")
    plt.plot(x, 1/(x+2)**2 - 1); plt.plot(x2, 1/(x2+2)**2 - 1, label="1/(x+2)^2 - 1")
    plt.legend(); plt.title("(g)"); plt.grid(); plt.show()

    #(h) f(x)=1-x^3, stretch horizontal by 2
    plt.figure()
    plt.plot(x, 1-x**3, label="1-x^3")
    plt.plot(x, 1-(x/2)**3, label="1-(x/2)^3")
    plt.legend(); plt.title("(h)"); plt.grid(); plt.show()

    # (i) f(x)=sqrt(x+1), compress horizontal by 4
    x = np.linspace(-1, 10, 1000)
    plt.figure()
    plt.plot(x, np.sqrt(x+1), label="sqrt(x+1)")
    plt.plot(x, np.sqrt(4*x+1), label="sqrt(4x+1)")
    plt.legend(); plt.title("(i)"); plt.grid(); plt.show()

    #(j) f(x)=sqrt(x+1), stretch vertical by 3
    plt.figure()
    plt.plot(x, np.sqrt(x+1), label="sqrt(x+1)")
    plt.plot(x, 3*np.sqrt(x+1), label="3sqrt(x+1)")
    plt.legend(); plt.title("(j)"); plt.grid(); plt.show()

def Ex7():
    import sympy as sp

    x = sp.symbols('x')

    # (a) f(x) = x^3 - x/2
    f1 = x**3 - x/2
    f1_prime = sp.diff(f1, x)
    cp1 = sp.solve(f1_prime, x)

    print("(a) f(x) = x^3 - x/2")
    print("f'(x) =", f1_prime)
    print("Critical points:", cp1)
    if cp1:
        print("=> f(x) is NOT one-to-one on R\n")
    else:
        print("=> f(x) is one-to-one on R\n")

    # (b) f(x) = x^2 + x/2
    f2 = x**2 + x/2
    f2_prime = sp.diff(f2, x)
    cp2 = sp.solve(f2_prime, x)

    print("(b) f(x) = x^2 + x/2")
    print("f'(x) =", f2_prime)
    print("Critical points:", cp2)
    if cp2:
        print("=> f(x) is NOT one-to-one on R")
    else:
        print("=> f(x) is one-to-one on R")

def show_menu():
    print("===== MENU =====")
    print("1. Exercise 1")
    print("2. Exercise 2")
    print("3. Exercise 3")
    print("4. Exercise 4")
    print("5. Exercise 5")
    print("6. Exercise 6")
    print("7. Exercise 7")
    print("0. Exit")
    
def main():
    while True:
        show_menu()
        try:
            choice = int(input("Choose exercise: "))
        except ValueError:
            print("Nhập số: ")
            continue

        if choice == 0:
            print("Thoát chương trình")
            break
        elif choice == 1:
            Ex1()
        elif choice == 2:
            Ex2()
        elif choice == 3:
            Ex3()
        elif choice == 4:
            Ex4()
        elif choice == 5:
            Ex5()
        elif choice == 6:
            Ex6()
        elif choice == 7:
            Ex7()
        else:
            print("Lựa chọn không hợp lệ!")
        print()
        
main()