public class Laptop extends ThietBi {
    private boolean coCardRoi;

    public Laptop(String maTB, String tenTB, String hangSanXuat, double giaGoc, boolean coCardRoi) {
        super(maTB, tenTB, hangSanXuat, giaGoc);
        this.coCardRoi = coCardRoi;
    }

    public double tinhGiaBan() {
        if (coCardRoi == true) {
            return getGiaGoc() + (getGiaGoc() * 0.25);

        } else {
            return getGiaGoc() + (getGiaGoc() * 0.15);
        }
    }

    public String toString() {
        return super.toString() + "Có card rời: " + coCardRoi;
    }
}
