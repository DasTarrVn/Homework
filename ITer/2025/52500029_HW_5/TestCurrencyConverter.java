public class TestCurrencyConverter {
    public static void main(String[] args) {
        System.out.println("=== CURRENCY CONVERTER TEST SUITE ===");

        // 1. Testing Default Constructor
        CurrencyConverter defaultConverter = new CurrencyConverter();
        System.out.println("\n[Test 1] Default Constructor:");
        System.out.println("Expected: Currency[amount=0.0,currencyCode=VND]");
        System.out.println("Actual:   " + defaultConverter.toString());

        // 2. Testing Parameterized Constructor
        CurrencyConverter vndConverter = new CurrencyConverter(1000000, "VND");
        System.out.println("\n[Test 2] Parameterized Constructor (VND):");
        System.out.println("Result: " + vndConverter.toString());

        // 3. Testing Copy Constructor
        CurrencyConverter copiedConverter = new CurrencyConverter(vndConverter);
        System.out.println("\n[Test 3] Copy Constructor:");
        System.out.println("Original: " + vndConverter.toString());
        System.out.println("Copied:   " + copiedConverter.toString());

        // 4. Testing toUSD Method
        System.out.println("\n[Test 4] Conversion to USD:");
        // VND to USD
        System.out.println("1,000,000 VND -> USD: " + vndConverter.toUSD());
        // EUR to USD
        CurrencyConverter eurConverter = new CurrencyConverter(100, "EUR");
        System.out.println("100 EUR -> USD: " + eurConverter.toUSD());

        // 5. Testing toEUR Method
        System.out.println("\n[Test 5] Conversion to EUR:");
        // VND to EUR
        System.out.println("1,000,000 VND -> EUR: " + vndConverter.toEUR());
        // USD to EUR
        CurrencyConverter usdConverter = new CurrencyConverter(50, "USD");
        System.out.println("50 USD -> EUR: " + usdConverter.toEUR());

        // 6. Testing equals Method
        System.out.println("\n[Test 6] Equality Check:");
        boolean isEqual = vndConverter.equals(copiedConverter);
        System.out.println("Are vndConverter and copiedConverter equal? " + isEqual);

        boolean isNotEqual = vndConverter.equals(eurConverter);
        System.out.println("Are vndConverter and eurConverter equal? " + isNotEqual);

        // 7. Testing Setters and Getters
        System.out.println("\n[Test 7] Setters and Getters:");
        defaultConverter.setAmount(250.5);
        defaultConverter.setCurrencyCode("USD");
        System.out.println("Updated Amount: " + defaultConverter.getAmount());
        System.out.println("Updated Currency: " + defaultConverter.getCurrencyCode());
        System.out.println("Final State: " + defaultConverter.toString());

        System.out.println("\n=== TEST COMPLETED ===");
    }
}