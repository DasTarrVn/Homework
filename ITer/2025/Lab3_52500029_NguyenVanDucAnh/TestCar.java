public class TestCar {
    public static void main(String[] args) {
        System.out.println("=== CAR SIMULATION SYSTEM TEST ===");

        // 1. Testing Constructors
        Car car1 = new Car(); // Default: honda, name1, blind, 0.0
        Car car2 = new Car("Toyota", "Camry", "Black", 120.0);
        Car car3 = new Car(car2); // Copy of car2

        System.out.println("\n[Test 1] Initialization:");
        System.out.println("Car 1 (Default): " + car1.toString());
        System.out.println("Car 2 (Custom):  " + car2.toString());

        // 2. Testing Normal Acceleration
        System.out.println("\n[Test 2] Normal Acceleration:");
        car1.accelerate(50);
        System.out.println("Car 1 after accelerating 50: " + car1.getSpeed() + " km/h");

        // 3. Testing Turbo Mode
        System.out.println("\n[Test 3] Turbo Mode Acceleration:");
        car1.accelerate(30, true); // 30 * 2 = 60
        System.out.println("Car 1 after 30 units Turbo (adds 60): " + car1.getSpeed() + " km/h");
        // Expected: 50 + 60 = 110.0

        // 4. Testing Braking System
        System.out.println("\n[Test 4] Braking:");
        car2.brake(30);
        System.out.println("Car 2 (120.0) after braking 30: " + car2.getSpeed() + " km/h");

        car2.brake(200); // Brake more than current speed
        System.out.println("Car 2 after heavy braking: " + car2.getSpeed() + " km/h (Should not be negative)");

        // 5. Testing Speed Comparison (Returns Object)
        System.out.println("\n[Test 5] Speed Comparison:");
        Car fasterCar = car1.speedCompare(car2);
        System.out.println("The faster car currently is: " + fasterCar.getBrand() + " " + fasterCar.getName());

        // 6. Testing Equality
        System.out.println("\n[Test 6] Equality Check:");
        System.out.println("Is Car 2 equal to its original copy (Car 3)? " + car2.equals(car3));
        // Result should be false because Car 2 braked and changed its speed.

        // 7. Testing Max Speed Limit
        System.out.println("\n[Test 7] Max Speed Limit:");
        car1.setSpeed(190);
        car1.accelerate(20); // 190 + 20 = 210 (> 200)
        System.out.println("Car 1 trying to exceed 200km/h: " + car1.getSpeed() + " (Should stay at 190)");

        System.out.println("\n=== ALL TESTS COMPLETED ===");
    }
}