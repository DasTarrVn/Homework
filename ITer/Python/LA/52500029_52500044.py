import numpy as np
import math

A = np.random.randint(1, 101, size=(10, 10))
B = np.random.randint(1, 31, size=(2, 10))
C = np.random.randint(1, 21, size=(10, 2))

print("Ma trận A:\n", A)
print("Ma trận B:\n", B)
print("Ma trận C:\n", C)

def task_a(A, B, C):
    A_T = A.T
    B_T = B.T
    C_T = C.T
    
    result = A + A_T + np.dot(C, B) + np.dot(B_T, C_T)
    print("\n--- Task A ---")
    print("Kết quả của A + A^T + CB + B^T C^T:\n", result)

def task_b(A, C, k=3):
    print("\n--- Task B ---")
    col_of_k = np.random.choice(A.shape[1], k, replace=False)

    print(f"Các cột được chọn (k={k}): {col_of_k}")
    
    A_sub = A[:, col_of_k]
    C_sub = C[col_of_k, :]
    
    result = np.dot(A_sub, C_sub)
    print("Kết quả tính toán:\n", result)
  

def task_c(A):
    print("\n--- Task C ---")
    v_odd = A[A % 2 != 0]
    
    v_unique_odd = np.unique(v_odd)
    
    v_sorted_odd_unique = np.sort(v_unique_odd)[::-1]
    print("Vector v:\n", v_sorted_odd_unique)

def is_prime(n):
    if n <= 1: return False
    
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

v_is_prime = np.vectorize(is_prime)

def task_d(A):
    print("\n--- Task D ---")
    
    d = A[v_is_prime(A)]
    print("Vector d :\n", d)
    
    if len(d) > 0:
        indices = np.arange(1, len(d) + 1)
        S = np.sum(d * indices)
    else:
        S = 0

    print(f"Kết quả tính toán S: {S}")
def task_e(A):
    print("\n--- Task E ---")
    
    prime_count_each_row = []
    
    for rows in A:
        count = 0  
        
        for num in rows: 
            if is_prime(num) == True:  
                count = count + 1  
                
        prime_count_each_row.append(count) 
        
    max_primes = max(prime_count_each_row)
    print(f"Số lượng số nguyên tố tối đa trong một hàng: {max_primes}")
    
    print("Các hàng thỏa mãn:")
    for i in range(len(prime_count_each_row)):
        if prime_count_each_row[i] == max_primes:
            print(f"Hàng {i + 1}: {A[i]}")

def longest_cons_odd_num_each_row(row):
    max_len = 0
    current_len = 0
    
    for num in row:
        if num % 2 != 0:  
            current_len = current_len + 1
            if current_len > max_len:
                max_len = current_len
        else:  
            current_len = 0  
            
    return max_len

def task_f(A):
    print("\n--- Task F ---")
    
    length_each_row = []
    for row in A:
        length = longest_cons_odd_num_each_row(row)
        length_each_row.append(length)
        
    max_length = max(length_each_row)
    print(f"Độ dài chuỗi số lẻ liên tiếp dài nhất: {max_length}")
    
    print("Các hàng thỏa mãn:")
    for i in range(len(length_each_row)):
        if length_each_row[i] == max_length and max_length > 0:
            print(f"Hàng {i + 1}: {A[i]}")

# task_a(A, B, C)
# task_b(A, C, k=3)
# task_c(A)
# task_d(A)
# task_e(A)
task_f(A)