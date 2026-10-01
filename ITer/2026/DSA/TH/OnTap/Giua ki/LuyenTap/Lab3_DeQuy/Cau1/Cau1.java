/**
 * ============================================================
 * ĐỀ BÀI - Câu 1 (3 điểm) [Tương tự Câu 2 đề thi số 1]
 * ============================================================
 *
 * Trong lớp Cau1, sinh viên định nghĩa phương thức:
 *   public static int recur(int n)
 * để giải bài toán sau bằng phương pháp ĐỆ QUY và trả về kết quả.
 *
 * Công thức:
 *   A(0) = 1
 *   A(1) = 2
 *   A(n) = A(n-1) + 2 * A(n-2) + n,  với n >= 2
 *
 *   Với n là số nguyên và n >= 0
 *
 * Ví dụ kiểm tra:
 *   recur(0) = 1
 *   recur(1) = 2
 *   recur(2) = A(1) + 2*A(0) + 2 = 2 + 2 + 2 = 6
 *   recur(3) = A(2) + 2*A(1) + 3 = 6 + 4 + 3 = 13
 *   recur(4) = A(3) + 2*A(2) + 4 = 13 + 12 + 4 = 29
 *
 * Sinh viên tự hiện thực trong phương thức main để kiểm tra lại bài làm.
 * Lưu ý phương thức main gây lỗi thì bị 0 điểm cả bài.
 */
public class Cau1 {

    // TODO: Implement recur(int n) bằng đệ quy
    // Gợi ý:
    //   if (n == 0) return 1;
    //   if (n == 1) return 2;
    //   return recur(n-1) + 2 * recur(n-2) + n;
    public static int recur(int n) {
        return 0; // TODO
    }

    public static void main(String[] args) {
        System.out.println("recur(0) = " + recur(0)); // Ky vong: 1
        System.out.println("recur(1) = " + recur(1)); // Ky vong: 2
        System.out.println("recur(2) = " + recur(2)); // Ky vong: 6
        System.out.println("recur(3) = " + recur(3)); // Ky vong: 13
        System.out.println("recur(4) = " + recur(4)); // Ky vong: 29
        // recur(5) = A(4) + 2*A(3) + 5 = 29 + 26 + 5 = 60
        System.out.println("recur(5) = " + recur(5)); // Ky vong: 60
    }
}
