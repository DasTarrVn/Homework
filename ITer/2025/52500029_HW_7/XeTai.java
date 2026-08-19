public class XeTai extends PhuongTien {
    private double taiTrong;

    public XeTai(String maPhuongTien, String tenPhuongTien, String hangSanXuat, double giaTriPhuongTien,
            double taiTrong) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, giaTriPhuongTien, taiTrong);
        this.taiTrong = taiTrong;
    }

    @Override
    public double chiPhi() {
        System.out.println("Xe tải có thêm tải trọng");
        return 0.0;
    }
}
