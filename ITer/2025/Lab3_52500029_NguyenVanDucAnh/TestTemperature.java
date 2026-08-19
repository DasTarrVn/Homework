public class TestTemperature {
    public static void main(String[] args) {
        System.out.println("=== TEMPERATURE SYSTEM TEST SUITE ===");

        // 1. Testing Constructors
        Temperature t1 = new Temperature(); // Default: 0.0, Unknown
        Temperature t2 = new Temperature(32.5, "HoChiMinh");
        Temperature t3 = new Temperature(-10.0, "NewYork");

        System.out.println("\n[Test 1] Initialization:");
        System.out.println("T1 (Default): " + t1.toString());
        System.out.println("T2 (Custom):  " + t2.toString());
        System.out.println("T3 (Custom):  " + t3.toString());

        // 2. Testing Conversion Methods
        System.out.println("\n[Test 2] Conversion Check (HoChiMinh):");
        System.out.println("Celsius:    " + t2.getCelsius() + "°C");
        System.out.println("Fahrenheit: " + t2.toFahrenheit() + "°F");
        System.out.println("Kelvin:     " + t2.toKelvin() + "K");

        // 3. Testing Comparison
        System.out.println("\n[Test 3] Comparing HoChiMinh and NewYork:");
        Temperature higher = t2.compares(t3);
        System.out.println("The place with higher temperature is: " + higher.getLocation() +
                " (" + higher.getCelsius() + "°C)");

        // 4. Testing Mutators (Setters)
        System.out.println("\n[Test 4] Updating T1 Data:");
        t1.setLocation("Tokyo");
        t1.setCelsius(15.0);
        System.out.println("Updated T1: " + t1.toString());

        // 5. Comparing updated T1 with T2
        System.out.println("\n[Test 5] Comparing Tokyo and HoChiMinh:");
        Temperature winner = t1.compares(t2);
        System.out.println("Higher: " + winner.getLocation() + " [" + winner.getCelsius() + "°C]");

        System.out.println("\n=== ALL TESTS COMPLETED ===");
    }
}