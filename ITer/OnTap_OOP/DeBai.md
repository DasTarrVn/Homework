# Đề Thi Ôn Tập OOP (Dựa trên HW 1-7 và Lab 1-10)

Chào bạn, dựa vào các kiến thức bạn đã học trong các bài tập trước đây (từ các kiểu dữ liệu cơ bản, mảng, chuỗi, đến các tính chất quan trọng của OOP như Kế thừa, Lớp trừu tượng, và Lớp nội - Inner Class), đây là một đề bài tổng hợp để bạn luyện tập cho kỳ thi cuối kỳ:

## Bài tập: Hệ thống Quản lý Thiết bị Công nghệ

### Yêu cầu:

**1. Lớp trừu tượng (Abstract Class) `ThietBi`**
Tạo một abstract class tên là `ThietBi` đại diện cho các thiết bị công nghệ cơ bản. Lớp này cần có:
- Các thuộc tính `private`: 
  - `maTB` (String): Mã thiết bị
  - `tenTB` (String): Tên thiết bị
  - `hangSanXuat` (String): Hãng sản xuất
  - `giaGoc` (double): Giá nhập gốc của thiết bị
- Viết Constructor với đầy đủ các tham số để khởi tạo các thuộc tính trên.
- Viết các phương thức Getter và Setter cho tất cả thuộc tính (Đóng gói - Encapsulation).
- Khai báo một phương thức trừu tượng (abstract method): `public abstract double tinhGiaBan();`
- Ghi đè phương thức `toString()` để trả về chuỗi chứa thông tin cơ bản của thiết bị.

**2. Các lớp Kế thừa (Inheritance & Polymorphism)**
Tạo các lớp con kế thừa từ lớp `ThietBi`:
*   **Lớp `DienThoai`:**
    *   Có thêm thuộc tính `private int dungLuongPin` (đơn vị mAh).
    *   Viết constructor đầy đủ tham số (gọi `super` cho các thuộc tính của cha).
    *   Cài đặt phương thức `tinhGiaBan()`: 
        *   Nếu `dungLuongPin > 3000`, giá bán = `giaGoc + (giaGoc * 0.20)` (lãi 20%).
        *   Ngược lại, giá bán = `giaGoc + (giaGoc * 0.10)` (lãi 10%).
    *   Ghi đè `toString()` để bổ sung thông tin `dungLuongPin` và `tinhGiaBan()`.

*   **Lớp `Laptop`:**
    *   Có thêm thuộc tính `private boolean coCardRoi` (`true` nếu có card đồ họa rời, `false` nếu không).
    *   Viết constructor đầy đủ tham số.
    *   Cài đặt phương thức `tinhGiaBan()`:
        *   Nếu `coCardRoi == true`, giá bán = `giaGoc + (giaGoc * 0.25)` (lãi 25%).
        *   Ngược lại, giá bán = `giaGoc + (giaGoc * 0.15)` (lãi 15%).
    *   Ghi đè `toString()` để bổ sung thông tin card rời và `tinhGiaBan()`.

**3. Lớp chứa và Lớp nội (Class & Inner Class)**
Tạo lớp `CuaHang` để lưu trữ và quản lý danh sách thiết bị. (Dựa vào kiến thức Lab 10).
- Các thuộc tính của `CuaHang`:
  - `tenCuaHang` (String)
  - `danhSachThietBi` (Mảng `ThietBi[]` hoặc `ArrayList<ThietBi>`)
- Bên trong lớp `CuaHang`, hãy tạo một **Inner Class** tên là `QuanLyThietBi`. Lớp nội này có các chức năng sau:
  - Phương thức `themThietBi(ThietBi tb)`: Dùng để thêm một thiết bị (Điện thoại hoặc Laptop) vào danh sách của cửa hàng.
  - Phương thức `inDanhSach()`: Duyệt qua danh sách thiết bị và in thông tin tất cả ra màn hình.
  - Phương thức `tinhTongGiaTri()`: Trả về tổng giá bán (`tinhGiaBan()`) của tất cả các thiết bị đang có trong cửa hàng.

**4. Lớp Kiểm thử (Main Class)**
Tạo lớp `Main` có hàm `main` để kiểm thử hệ thống:
- Tạo một đối tượng `CuaHang`.
- Khởi tạo đối tượng inner class `QuanLyThietBi` từ cửa hàng đó.
- Tạo ít nhất 2 chiếc `DienThoai` (1 cái pin > 3000, 1 cái pin <= 3000) và 2 chiếc `Laptop` (1 cái có card rời, 1 cái không).
- Dùng `QuanLyThietBi` để thêm các thiết bị này vào danh sách.
- In ra toàn bộ danh sách thiết bị.
- In ra màn hình dòng chữ "Tổng giá trị cửa hàng là: ..." và gọi hàm tính tổng.

---
**Hướng dẫn thêm cho bạn:**
Bài tập này kết hợp:
- **HW 7:** Kế thừa từ abstract class (giống `PhuongTien`, `Oto`, `XeMay`).
- **Lab 10:** Khởi tạo và sử dụng Inner Class (giống `Student.StudentOperator`).
- **Lab 5:** Dùng mảng (Array) hoặc ArrayList, kế thừa phương thức `toString()`.

Bạn có thể tạo các file java (vd `ThietBi.java`, `DienThoai.java`, ...) ngay trong thư mục này để code nhé. Nếu bạn cần tôi gợi ý, xem trước cấu trúc code, hoặc chấm bài sau khi bạn code xong thì cứ gọi tôi! Chúc ôn thi tốt!
