public abstract class PhuongTien {
    private String maPhuongTien;
    private String tenPhuongTien;
    private String hangSanXuat;
    private Double giaTriPhuongTien;

    public abstract double chiPhi();

    public PhuongTien(String maPhuongTien, String tenPhuongTien, String hangSanXuat, double giaTriPhuongTien,
            double taiTrong) {
        this.maPhuongTien = maPhuongTien;
        this.tenPhuongTien = tenPhuongTien;
        this.hangSanXuat = hangSanXuat;
        this.giaTriPhuongTien = giaTriPhuongTien;
    }
}