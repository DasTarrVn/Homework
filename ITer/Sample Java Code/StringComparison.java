public class StringComparison {
    public static void main(String[] args) {
        
        // 1. String: Immutable
        String str = "Hello";
        str.concat(" World"); 
        // Note: The line above creates a new string but doesn't assign it anywhere.
        // Original 'str' remains unchanged.
        System.out.println("String: " + str); 

        // 2. StringBuilder: Mutable (Not Thread-Safe)
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.append(" World"); 
        // This modifies the existing object directly.
        System.out.println("StringBuilder: " + sBuilder);

        // 3. StringBuffer: Mutable (Thread-Safe)
        StringBuffer sBuffer = new StringBuffer("Hello");
        sBuffer.append(" World");
        // This also modifies the existing object.
        System.out.println("StringBuffer: " + sBuffer);
    }
}