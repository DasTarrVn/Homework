/**
 * ============================================================
 * ĐỀ BÀI - Câu 2 (3 điểm) [Tương tự Câu 2 đề ôn tập]
 * ============================================================
 *
 * Trong lớp Cau2, sinh viên định nghĩa phương thức:
 *   public static int recur(int n, int k)
 * để giải bài toán sau bằng phương pháp ĐỆ QUY và trả về kết quả.
 *
 * Công thức (tính lũy thừa):
 *   f(n, k) = 1,              nếu k = 0
 *   f(n, k) = n * f(n, k-1), nếu k > 0
 *
 *   Với n là số nguyên, k là số nguyên và k >= 0
 *
 * Ý nghĩa: f(n, k) = n^k  (n mũ k)
 *
 * Ví dụ kiểm tra:
 *   recur(2, 0) = 1   (2^0 = 1)
 *   recur(2, 1) = 2   (2^1 = 2)
 *   recur(2, 3) = 8   (2^3 = 8)
 *   recur(3, 4) = 81  (3^4 = 81)
 *   recur(5, 2) = 25  (5^2 = 25)
 *
 * Sinh viên tự hiện thực trong phương thức main để kiểm tra lại bài làm.
 * Lưu ý phương thức main gây lỗi thì bị 0 điểm cả bài.
 */
public class Cau2 {

    // TODO: Implement recur(int n, int k) bằng đệ quy
    // Gợi ý:
    //   if (k == 0) return 1;
    //   return n * recur(n, k - 1);
    public static int recur(int n, int k) {
        return 0; // TODO
    }

    public static void main(String[] args) {
        System.out.println("recur(2, 0) = " + recur(2, 0)); // Ky vong: 1
        System.out.println("recur(2, 1) = " + recur(2, 1)); // Ky vong: 2
        System.out.println("recur(2, 3) = " + recur(2, 3)); // Ky vong: 8
        System.out.println("recur(3, 4) = " + recur(3, 4)); // Ky vong: 81
        System.out.println("recur(5, 2) = " + recur(5, 2)); // Ky vong: 25
        System.out.println("recur(1,10) = " + recur(1, 10)); // Ky vong: 1
        System.out.println("recur(10,0) = " + recur(10, 0)); // Ky vong: 1
    }
}
