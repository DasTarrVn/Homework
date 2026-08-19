import math
import numpy as np
import sympy as sp
import matplotlib.pyplot as plt

A = 90

x = sp.Symbol('x')

f = x**2 - 2*A*x - A**2
g = -x**2 + 4*A*x + A**3

eq_1a = sp.Eq(f, g)
roots_1a = sp.solve(eq_1a, x)

points_1a = [] 
for i, root in enumerate(roots_1a):
    x_val = float(root)
    y_val = float(f.subs(x, x_val)) 
    points_1a.append((x_val, y_val))
    print(f"1a. Intersection point {i+1} : ( {x_val} , {y_val} )")

x_vals_1a = np.linspace(points_1a[0][0] - 1000, points_1a[1][0] + 1000, 400)
f_func = sp.lambdify(x, f, 'numpy')
g_func = sp.lambdify(x, g, 'numpy')

plt.figure(1, figsize=(8, 6))
plt.plot(x_vals_1a, f_func(x_vals_1a), 'b-', label='f(x)')
plt.plot(x_vals_1a, g_func(x_vals_1a), 'r-', label='g(x)')

for px, py in points_1a:
    plt.plot(px, py, 'go') 

plt.title('Question 1a')
plt.legend()

x0_1b = 0
y0_1b = -A**2

df = sp.diff(f, x)
m_1b = df.subs(x, x0_1b)

tangent_1b = m_1b * (x - x0_1b) + y0_1b
print(f"Equation of the tangent line to the curve f(x) : {tangent_1b}")

f_shift = f - 4*A**3

eq_1b = sp.Eq(f_shift, tangent_1b)
roots_1b = sp.solve(eq_1b, x)

points_1b = []
for i, root in enumerate(roots_1b):
    x_val = float(root)
    y_val = float(f_shift.subs(x, x_val))
    points_1b.append((x_val, y_val))
    print(f"1b. Intersection point {i+1} : ( {x_val} , {y_val} )")

x_vals_1b = np.linspace(points_1b[0][0] - 500, points_1b[1][0] + 500, 400)
f_shift_func = sp.lambdify(x, f_shift, 'numpy')
tangent_1b_func = sp.lambdify(x, tangent_1b, 'numpy')

plt.figure(2, figsize=(8, 6))
plt.plot(x_vals_1b, f_func(x_vals_1b), 'b-', label='f(x)')
plt.plot(x_vals_1b, f_shift_func(x_vals_1b), 'r-', label='shifted f(x)')
plt.plot(x_vals_1b, tangent_1b_func(x_vals_1b), color='orange', label='tangent line to f(x)')

plt.plot(x0_1b, y0_1b, 'go')
for px, py in points_1b:
    plt.plot(px, py, 'ko')

plt.title('Question 1b')
plt.legend()

x0 = sp.Symbol('x0')

f_x0 = x0**2 - 2*A*x0 - A**2
df_x0 = 2*x0 - 2*A
eq_1c = sp.Eq(-4*A**3, df_x0 * (0 - x0) + f_x0)

roots_x0 = sp.solve(eq_1c, x0)

tangents_1c = []
points_1c = [] 

for i, root in enumerate(roots_x0):
    m_1c = df.subs(x, root)
    y_contact = f.subs(x, root)
    tangent_eq = m_1c * (x - root) + y_contact 
    tangents_1c.append(tangent_eq)
    points_1c.append((float(root), float(y_contact)))
    
    print(f"Equation of the tangent line {i+1} to the curve f(x) : {tangent_eq.evalf()}")

x_vals_1c = np.linspace(points_1c[0][0] - 500, points_1c[1][0] + 500, 400)
T1_func = sp.lambdify(x, tangents_1c[0], 'numpy')
T2_func = sp.lambdify(x, tangents_1c[1], 'numpy')

plt.figure(3, figsize=(8, 6))
plt.plot(x_vals_1c, f_func(x_vals_1c), 'b-', label='f(x)')
plt.plot(x_vals_1c, T1_func(x_vals_1c), label='tangent line 1')
plt.plot(x_vals_1c, T2_func(x_vals_1c), label='tangent line 2')

for px, py in points_1c:
    plt.plot(px, py, 'ko') 

plt.plot(0, -4*A**3, 'go')

plt.title('Question 1c')
plt.legend()

plt.show()