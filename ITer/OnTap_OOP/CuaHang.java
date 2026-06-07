import java.util.*;

public class CuaHang {
    String tenCuaHang;
    ArrayList<ThietBi> dstb = new ArrayList<>();

    public CuaHang() {
        tenCuaHang = "Abc";
    }

    class QuanLyThietBi {
        void themThietBi(ThietBi tb) {
            dstb.add(tb);
        }

        void inDanhSach() {
            for (ThietBi thietBi : dstb) {
                System.out.println(thietBi);
            }
        }

        double tinhTongGiaTri() {
            double sum = 0;
            for (ThietBi thietBi : dstb) {
                sum += thietBi.tinhGiaBan();
            }
            return sum;
        }
    }

}
