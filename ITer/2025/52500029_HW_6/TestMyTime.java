public class TestMyTime {
    public static void main(String[] args) {
        System.out.println("=== 1. TEST CONSTRUCTORS ===");
        MyTime t1 = new MyTime();
        System.out.println("Time 1 (Default): " + t1.toString());
        MyTime t2 = new MyTime(14, 5, 9);
        System.out.println("Time 2 (Params): " + t2.toString());
        MyTime t3 = new MyTime(t2);
        System.out.println("Time 3 (Copy t2): " + t3.toString());
        System.out.println("\n=== 2. TEST CASCADING LOGIC (NEXT SECOND) ===");
        MyTime t4 = new MyTime(10, 59, 59);
        System.out.println("Current Time: " + t4.toString());
        System.out.println("Next Second:  " + t4.nextSecond().toString());
        MyTime t5 = new MyTime(23, 59, 59);
        System.out.println("\nCurrent Time: " + t5.toString());
        System.out.println("Next Second:  " + t5.nextSecond().toString());
        System.out.println("\n=== 3. TEST CASCADING LOGIC (PREVIOUS SECOND) ===");
        MyTime t6 = new MyTime(11, 0, 0);
        System.out.println("Current Time: " + t6.toString());
        System.out.println("Prev Second:  " + t6.previousSecond().toString());
        MyTime t7 = new MyTime(0, 0, 0);
        System.out.println("\nCurrent Time: " + t7.toString());
        System.out.println("Prev Second:  " + t7.previousSecond().toString());
        System.out.println("\n=== 4. TEST SETTERS  ===");
        MyTime t8 = new MyTime(23, 59, 0);
        System.out.println("Before Set: " + t8.toString());
        t8.setSecond(60);
        System.out.println("After setSecond(60): " + t8.toString());
        System.out.println("\n=== 5. TEST EQUALS ===");
        System.out.println("t2 equals t3? " + t2.equals(t3));
    }
}