public class XeMay extends PhuongTien {
    private double dungTichXiLanh;

    public XeMay(String maPhuongTien, String tenPhuongTien, String hangSanXuat, double giaTriPhuongTien,
            double dungTichXiLanh) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, giaTriPhuongTien);
        this.dungTichXiLanh = dungTichXiLanh;
    }

    @Override
    public double chiPhi() {
        System.out.println("Xe máy có thêm dung tích xi-lanh");
        return 0.0;
    }
}
