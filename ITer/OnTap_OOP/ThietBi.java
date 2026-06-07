public abstract class ThietBi {
    private String maTB;
    private String tenTB;
    private String hangSanXuat;
    private double giaGoc;

    public ThietBi(String maTB, String tenTB, String hangSanXuat, double giaGoc) {
        this.maTB = maTB;
        this.tenTB = tenTB;
        this.hangSanXuat = hangSanXuat;
        this.giaGoc = giaGoc;
    }

    public String getMaTB() {
        return maTB;
    }

    public String getTenTB() {
        return tenTB;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public double getGiaGoc() {
        return giaGoc;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public void setTenTB(String tenTB) {
        this.tenTB = tenTB;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setGiaGoc(double giaGoc) {
        this.giaGoc = giaGoc;
    }

    public abstract double tinhGiaBan();

    public String toString() {
        return "Mã thiết bị: " + getMaTB() + "\n"
                + "Tên thiết bị: " + getTenTB() + "\n"
                + "Hãng sản xất: " + getHangSanXuat() + "\n"
                + "Giá gốc: " + getGiaGoc() + "\n";
    }
}