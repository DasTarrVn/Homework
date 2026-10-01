import java.util.Stack;

/**
 * ============================================================
 * ĐỀ BÀI - Câu 2 (3 điểm) [Tương tự Câu 3 đề ôn tập]
 * ============================================================
 *
 * Trong lớp Cau2, sinh viên định nghĩa phương thức:
 *   public static int calculate(String[] expression)
 * dùng Stack để tính toán biểu thức hậu tố (postfix) theo giải thuật sau.
 *
 * Tại câu này, sinh viên được phép sử dụng thư viện Stack có sẵn của Java.
 * Câu lệnh import java.util.Stack; đã có sẵn trong file này.
 *
 * Cho một mảng String gồm các phần tử số nguyên, phép toán cộng (+) hoặc trừ (-).
 * Thực hiện tính và trả về kết quả theo giải thuật sau:
 *
 * 1. Tạo một Stack<Integer>.
 * 2. Xét từng phần tử trong mảng String:
 *    2.1. Nếu phần tử là số → đưa vào Stack.
 *    2.2. Nếu phần tử là phép toán → lấy 2 phần tử từ Stack ra:
 *         gọi phần tử LẤY RA ĐẦU TIÊN là o1, phần tử LẤY RA THỨ HAI là o2,
 *         tính o3 = o2 <phép toán> o1, đưa o3 vào Stack.
 *         *** CHÚ Ý THỨ TỰ: o3 = o2 op o1 (KHÔNG phải o1 op o2) ***
 * 3. Kết quả cuối cùng trong Stack chính là kết quả phải trả về.
 *
 * Ví dụ: {"3", "4", "+", "2", "1", "+", "-"}
 *   "3"→[3], "4"→[4,3]
 *   "+"→ o1=4, o2=3, o3=3+4=7 → [7]
 *   "2"→[2,7], "1"→[1,2,7]
 *   "+"→ o1=1, o2=2, o3=2+1=3 → [3,7]
 *   "-"→ o1=3, o2=7, o3=7-3=4 → [4]
 *   Kết quả: 4
 *
 * Dữ liệu đầu vào luôn hợp lệ (biểu thức hậu tố đúng).
 */
public class Cau2 {

    // TODO: Implement calculate(String[] expression)
    public static int calculate(String[] expression) {
        // Gợi ý:
        //   Stack<Integer> stack = new Stack<>();
        //   for (String token : expression) {
        //       if (isNumber(token)) { stack.push(Integer.parseInt(token)); }
        //       else {
        //           int o1 = stack.pop();   // lay ra truoc
        //           int o2 = stack.pop();   // lay ra sau
        //           // tinh o3 = o2 op o1
        //           stack.push(o3);
        //       }
        //   }
        //   return stack.pop();
        return 0; // TODO
    }

    // Phương thức hỗ trợ - đã cho sẵn
    public static boolean isNumber(String str) {
        return str.matches("0|([1-9][0-9]*)");
    }

    public static void main(String[] args) {
        // Test 1: {"3","4","+","2","1","+","-"} → ky vong: 4
        System.out.println("Test 1: " + calculate(new String[]{"3", "4", "+", "2", "1", "+", "-"}));

        // Test 2: {"5","3","-"} → o1=3, o2=5, o3=5-3=2
        System.out.println("Test 2: " + calculate(new String[]{"5", "3", "-"}));

        // Test 3: {"2","3","+","4","+"} → (2+3)+4=9
        System.out.println("Test 3: " + calculate(new String[]{"2", "3", "+", "4", "+"}));

        // Test 4: {"10","4","3","+","2","-","+"}
        // "10"→[10], "4"→[4,10], "3"→[3,4,10]
        // "+"→o1=3,o2=4,o3=7→[7,10]
        // "2"→[2,7,10], "-"→o1=2,o2=7,o3=5→[5,10]
        // "+"→o1=5,o2=10,o3=15→[15]
        // Ky vong: 15
        System.out.println("Test 4: " + calculate(new String[]{"10", "4", "3", "+", "2", "-", "+"}));
    }
}
