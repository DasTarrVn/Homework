public class Main {
    public static void main(String[] args) {
        CuaHang ch = new CuaHang();
        CuaHang.QuanLyThietBi ql = ch.new QuanLyThietBi();
        DienThoai iphone12promax = new DienThoai("a", "a", "a", 5.0, 5000);
        DienThoai iqooz5 = new DienThoai("b", "b", "b", 5.0, 2000);
        Laptop abc = new Laptop(null, null, null, 6.0, false);
        Laptop xyz = new Laptop(null, null, null, 9.6, true);
        ql.themThietBi(iphone12promax);
        ql.themThietBi(iqooz5);
        ql.themThietBi(abc);
        ql.themThietBi(xyz);
        ql.inDanhSach();
        System.out.println("Tổng giá trị của hàng là: " + ql.tinhTongGiaTri());
    }
}
