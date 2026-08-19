package Lab2_52500029_NguyenVanDucAnh;
import java.awt.Point;
import java.text.DecimalFormat;

public class DroneTelemetryProcessor {
    public static void main(String[] args) {
        // The packet: DroneID:AX-101|Loc:42,88|Bat:0.845
        String data = "DroneID:AX-101|Loc:42,88|Bat:0.845";
        int locIndex = data.indexOf("Loc:");
        int batIndex = data.indexOf("Bat:");
        int commaIndex1 = data.indexOf(",", locIndex);
        String str_x = data.substring(locIndex + 4, commaIndex1);
        String str_y = data.substring(commaIndex1 + 1, batIndex - 1);
        int x = Integer.parseInt(str_x);
        int y = Integer.parseInt(str_y);
        Point loc = new Point(x, y);
        // System.out.println(loc);
        String strBat = data.substring(batIndex + 4);
        double bat = Double.parseDouble(strBat);
        // System.out.print(bat);
        DecimalFormat df = new DecimalFormat("##.#%");

        System.out.println("Battery level: " + df.format(bat));
        if (batCheck(bat) == true) {
            System.out.println("Battery is in Safety zone");
        } else {
            System.out.println("Battery is not in Safety zone");
        }
        System.out.println(loc.toString());
    }

    public static boolean batCheck(double bat) {
        if (Math.min(bat, 0.15) == 0.15 && Math.max(bat, 0.95) == 0.95) {
            return true;
        }
        return false;
    }
}
