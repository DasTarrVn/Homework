public class Oto extends PhuongTien {

    private int soChoNgoi;

    public Oto(String maPhuongTien, String tenPhuongTien, String hangSanXuat, double giaTriPhuongTien,
            int soChoNgoi) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, giaTriPhuongTien);
        this.soChoNgoi = soChoNgoi;
    }

    @Override
    public double chiPhi() {
        System.out.println("Ô tô có thêm số chỗ ngồi");
        return 0.0;
    }
}
