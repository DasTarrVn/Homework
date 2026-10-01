import java.util.LinkedList;
import java.util.Queue;

/**
 * ============================================================
 * ĐỀ BÀI - Câu 3 (3 điểm) [Bài tập mở rộng - Queue]
 * ============================================================
 *
 * Trong lớp Cau3, sinh viên định nghĩa phương thức:
 *   public static String simulate(String[] commands)
 * dùng Queue để mô phỏng hàng đợi phục vụ theo giải thuật sau.
 *
 * Cho một mảng String, mỗi phần tử là một tên khách hàng hoặc lệnh "SERVE".
 *
 * 1. Tạo một Queue<String>.
 * 2. Xét lần lượt từng phần tử trong mảng:
 *    2.1. Nếu phần tử KHÔNG phải "SERVE" → thêm vào Queue (enqueue).
 *    2.2. Nếu phần tử là "SERVE" → lấy khách hàng đầu tiên ra phục vụ (dequeue),
 *         nối tên vào chuỗi kết quả.
 *         Nếu Queue rỗng → bỏ qua lệnh "SERVE" này.
 * 3. Trả về chuỗi kết quả chứa tên các khách hàng đã phục vụ, cách nhau bằng dấu cách.
 *    Nếu không ai được phục vụ → trả về chuỗi rỗng "".
 *
 * Ví dụ: {"Alice", "Bob", "SERVE", "Charlie", "SERVE", "SERVE"}
 *   "Alice"   → Queue: [Alice]
 *   "Bob"     → Queue: [Alice, Bob]
 *   "SERVE"   → phục vụ Alice → Queue: [Bob], result: "Alice"
 *   "Charlie" → Queue: [Bob, Charlie]
 *   "SERVE"   → phục vụ Bob   → Queue: [Charlie], result: "Alice Bob"
 *   "SERVE"   → phục vụ Charlie → Queue: [], result: "Alice Bob Charlie"
 *   Trả về: "Alice Bob Charlie"
 */
public class Cau3 {

    // TODO: Implement simulate(String[] commands)
    public static String simulate(String[] commands) {
        // Gợi ý:
        //   Queue<String> queue = new LinkedList<>();
        //   StringBuilder result = new StringBuilder();
        //   for (String cmd : commands) { ... }
        //   return result.toString().trim();
        return ""; // TODO
    }

    public static void main(String[] args) {
        // Test 1: Ky vong: "Alice Bob Charlie"
        String[] c1 = {"Alice", "Bob", "SERVE", "Charlie", "SERVE", "SERVE"};
        System.out.println("Test 1: " + simulate(c1));

        // Test 2: SERVE khi Queue rong bi bo qua
        // Ky vong: "Alice"
        String[] c2 = {"SERVE", "Alice", "SERVE"};
        System.out.println("Test 2: " + simulate(c2));

        // Test 3: Khong co lenh SERVE → ky vong: ""
        String[] c3 = {"Alice", "Bob", "Charlie"};
        System.out.println("Test 3: '" + simulate(c3) + "'");

        // Test 4: FIFO dung thu tu
        // Ky vong: "A B C D"
        String[] c4 = {"A", "B", "C", "SERVE", "D", "SERVE", "SERVE", "SERVE"};
        System.out.println("Test 4: " + simulate(c4));
    }
}
