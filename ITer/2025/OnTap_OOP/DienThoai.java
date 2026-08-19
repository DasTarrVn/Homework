public class DienThoai extends ThietBi {
    private int dungLuongPin;

    public DienThoai(String maTB, String tenTB, String hangSanXuat, double giaGoc, int dungLuongPin) {
        super(maTB, tenTB, hangSanXuat, giaGoc);
        this.dungLuongPin = dungLuongPin;
    }

    public double tinhGiaBan() {
        if (dungLuongPin > 3000.0) {
            return getGiaGoc() + (getGiaGoc() * 0.20);
        } else {
            return getGiaGoc() + (getGiaGoc() * 0.10);
        }
    }

    public String toString() {
        return super.toString() + "Dung lượng pin: " + dungLuongPin;
    }
}
