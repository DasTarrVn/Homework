import java.util.Stack;

/**
 * ============================================================
 * ĐỀ BÀI - Câu 1 (3 điểm) [Tương tự Câu 3 đề thi số 1]
 * ============================================================
 *
 * Trong lớp Cau1, sinh viên định nghĩa phương thức:
 *   public static int process(String[] ops)
 * dùng Stack để xử lý mảng lệnh theo giải thuật mô tả bên dưới.
 *
 * Tại câu này, sinh viên được phép sử dụng thư viện Stack có sẵn của Java.
 * Câu lệnh import java.util.Stack; đã có sẵn trong file này.
 *
 * Cho một mảng String, mỗi phần tử là một số nguyên không âm
 * hoặc một trong ba lệnh "C", "D", "S".
 * Sinh viên xử lý và trả về kết quả theo giải thuật sau:
 *
 * 1. Tạo một Stack<Integer>.
 * 2. Xét lần lượt từng phần tử trong mảng String:
 *    2.1. Nếu phần tử là số → đưa vào Stack.
 *    2.2. Nếu phần tử là "C" → lấy phần tử trên cùng ra khỏi Stack (bỏ đi).
 *    2.3. Nếu phần tử là "D" → xem giá trị phần tử trên cùng (không lấy ra),
 *         nhân đôi giá trị đó rồi đưa kết quả vào Stack.
 *    2.4. Nếu phần tử là "S" → gọi phần tử trên cùng là o1, phần tử ngay
 *         bên dưới o1 là o2, tính o3 = o1 + o2 rồi đưa o3 vào Stack.
 *         Lưu ý: o1 và o2 VẪN được giữ lại trong Stack.
 * 3. Kết quả trả về là TỔNG các phần tử còn lại trong Stack.
 *    Nếu Stack rỗng thì trả về 0.
 *
 * Ví dụ: mảng {"5", "2", "C", "D", "S"}
 *   "5"  → Stack: [5]
 *   "2"  → Stack: [2, 5]           (trái = đỉnh)
 *   "C"  → bỏ 2 → Stack: [5]
 *   "D"  → 5×2=10 → Stack: [10, 5]
 *   "S"  → o1=10, o2=5, o3=15 → Stack: [15, 10, 5]
 *   Kết quả: 15 + 10 + 5 = 30
 *
 * Phương thức isNumber(String str) đã cho sẵn trong file này.
 */
public class Cau1 {

    // TODO: Implement process(String[] ops)
    public static int process(String[] ops) {
        // Gợi ý:
        //   Stack<Integer> stack = new Stack<>();
        //   for (String op : ops) {
        //       if (isNumber(op)) { stack.push(Integer.parseInt(op)); }
        //       else if (op.equals("C")) { ... }
        //       else if (op.equals("D")) { ... }
        //       else if (op.equals("S")) { ... }
        //   }
        //   // tính tổng các phần tử trong stack
        return 0; // TODO
    }

    // Phương thức hỗ trợ - đã cho sẵn, KHÔNG sửa
    private static boolean isNumber(String str) {
        return str.matches("0|([1-9][0-9]*)");
    }

    public static void main(String[] args) {
        // Test 1: {"5", "2", "C", "D", "S"} → ky vong: 30
        System.out.println("Test 1: " + process(new String[]{"5", "2", "C", "D", "S"}));

        // Test 2: {"5", "1", "2", "C", "D"}
        // "5"→[5], "1"→[1,5], "2"→[2,1,5], "C"→[1,5], "D"→[2,1,5]
        // Tong: 2+1+5 = 8
        System.out.println("Test 2: " + process(new String[]{"5", "1", "2", "C", "D"}));

        // Test 3: {"3", "4", "S", "D"}
        // "3"→[3], "4"→[4,3], "S"→o1=4,o2=3,o3=7→[7,4,3], "D"→[14,7,4,3]
        // Tong: 14+7+4+3 = 28
        System.out.println("Test 3: " + process(new String[]{"3", "4", "S", "D"}));

        // Test 4: Stack rong sau khi C
        System.out.println("Test 4 (rong): " + process(new String[]{"5", "C"}));
        // Ky vong: 0

        // Test 5: chi co so
        System.out.println("Test 5: " + process(new String[]{"1", "2", "3"}));
        // Ky vong: 6
    }
}
