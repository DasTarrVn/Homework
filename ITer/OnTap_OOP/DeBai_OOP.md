# ĐỀ BÀI ÔN TẬP CÚ PHÁP LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG (OOP)

Dưới đây là danh sách các yêu cầu về cú pháp OOP cơ bản và quan trọng. Bạn có thể sử dụng bất kỳ ngôn ngữ nào bạn đang ôn tập (Java, C++, C#, Python, v.v.).

**Luật chơi:**
- Nếu câu nào bạn đã nắm vững và không cần luyện tập, hãy phản hồi lại bằng từ **"ok"** ở câu đó, mình sẽ tự động bỏ qua và không chấm điểm.
- Nếu câu nào bạn muốn ôn lại, hãy viết code (cú pháp) cho câu đó vào phần phản hồi, mình sẽ chấm điểm, sửa lỗi và giải thích chi tiết giúp bạn.

---

### PHẦN 1: LỚP VÀ ĐỐI TƯỢNG (Class & Object)
**Câu 1:** Viết cú pháp tạo một lớp (class) có tên là `HocSinh` với 2 thuộc tính cơ bản là `ten` (chuỗi) và `tuoi` (số nguyên).
**Câu 2:** Khởi tạo một đối tượng (object) từ lớp `HocSinh` vừa tạo.

### PHẦN 3: HÀM KHỞI TẠO (Constructor)
**Câu 3:** Viết cú pháp cho một hàm khởi tạo mặc định (không tham số) và một hàm khởi tạo có tham số (truyền vào `ten` và `tuoi`) cho lớp `HocSinh`.

### PHẦN 4: ĐÓNG GÓI (Encapsulation) & PHẠM VI TRUY CẬP (Access Modifiers)
**Câu 4:** Sửa lại lớp `HocSinh` sao cho các thuộc tính `ten` và `tuoi` là **private** (chỉ có thể truy cập trong nội bộ lớp).
**Câu 5:** Viết các phương thức Getter và Setter (để lấy dữ liệu và gán dữ liệu) cho thuộc tính `ten` và `tuoi`.

### PHẦN 5: KẾ THỪA (Inheritance)
**Câu 6:** Tạo một lớp mới tên là `LopTruong`. Viết cú pháp để lớp `LopTruong` kế thừa từ lớp `HocSinh`.
**Câu 7:** Trong lớp `LopTruong`, thêm một thuộc tính mới là `nhiemVu` (chuỗi). Viết constructor cho `LopTruong` sử dụng `super` (hoặc từ khóa tương đương) để gọi constructor của lớp cha.

### PHẦN 6: ĐA HÌNH (Polymorphism)
**Câu 8 (Overloading - Nạp chồng):** Viết 2 phương thức tên là `hocBai` trong lớp `HocSinh`. Phương thức thứ nhất không có tham số (in ra "Đang học bài"). Phương thức thứ hai nhận vào một tham số chuỗi `monHoc` (in ra "Đang học môn [monHoc]").
**Câu 9 (Overriding - Ghi đè):** Trong lớp cha `HocSinh` có một phương thức `gioiThieu()` in ra "Tôi là học sinh". Hãy ghi đè (override) phương thức này trong lớp `LopTruong` để in ra "Tôi là lớp trưởng".

### PHẦN 7: TRỪU TƯỢNG (Abstraction)
**Câu 10 (Abstract Class - Lớp trừu tượng):** Viết cú pháp tạo một lớp trừu tượng `Nguoi` có một phương thức trừu tượng tên là `diLai()`.
**Câu 11 (Interface - Giao diện):** Viết cú pháp tạo một interface tên là `HoatDong` với phương thức `choiTheThao()`. Viết cú pháp để lớp `HocSinh` implement (thực thi) interface này.

### PHẦN 8: ARRAYLIST & COLLECTIONS
**Câu 12:** Khởi tạo một `ArrayList` chứa các số nguyên (`Integer`) và thêm 3 giá trị (10, 20, 30) vào danh sách đó.
**Câu 13:** Viết cú pháp duyệt qua `ArrayList` vừa tạo bằng vòng lặp `for-each` để in từng phần tử ra màn hình.

### PHẦN 9: GENERIC CLASS (Lớp tổng quát)
**Câu 14:** Tạo một Generic Class tên là `HopChua<T>` có một thuộc tính `duLieu` mang kiểu `T`.
**Câu 15:** Viết các phương thức `layDuLieu()` để trả về giá trị của `duLieu`, và `datDuLieu(T giaTri)` để gán giá trị cho nó.
**Câu 16:** Khởi tạo một đối tượng từ `HopChua` để lưu trữ một chuỗi (String) là "Hello Generic".

### PHẦN 10: CÁC LOẠI INNER CLASS (Lớp lồng nhau - Nested/Inner Class)
**Câu 17 (Member Inner Class):** Tạo một lớp `LopNgoai` (Outer class). Bên trong `LopNgoai` tạo một lớp `LopTrong` (Inner class, không có từ khóa static). Viết cú pháp để khởi tạo đối tượng của `LopTrong` từ một phương thức `main` (hoặc từ bên ngoài).
**Câu 18 (Static Nested Class):** Tạo một lớp static `LopTrongStatic` bên trong `LopNgoai`. Viết cú pháp khởi tạo đối tượng của `LopTrongStatic` này từ bên ngoài `LopNgoai`.
**Câu 19 (Anonymous Inner Class - Lớp ẩn danh):** Cho một interface `ChaoHoi` có phương thức `xinChao()`. Viết cú pháp tạo ra một lớp ẩn danh (Anonymous class) thực thi interface `ChaoHoi`, ghi đè `xinChao()` và sau đó gọi luôn phương thức đó.

---
**Đây là những phần thường hay gặp và rất quan trọng, đặc biệt là trong Java! Bạn cứ thoải mái viết đáp án nháp cho các phần này vào đây nhé. Chỗ nào quên hoặc chưa chắc chắn, cứ báo để mình nhắc lại và giải thích!**
Tất cả đều được code dựa theo ngôn ngữ java
Phần 10
public class LopNgoai{
    class LopTrong{

    }
    static class LopTrongStatic{

    }
    public static void main(String[] args ){
        LopNgoai ln = new LopNgoai();
        LopNgoai.LopTrong lt = ln.new LopTrong();
        LopNgoai.LopTrongStatic ltst = new LopNgoai.LopTrongStatic();
        ChaoHoi ch = new ChaoHoi(){
            public void xinChao(){
                System.out.println("xin chao");
        }  
        }
    }

}
public interface ChaoHoi{
    public void xinChao();
}