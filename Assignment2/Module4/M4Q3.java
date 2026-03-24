public class M4Q3 {
    public static void main(String[] args) {
        // String (immutable)
        String s1 = "Hello";
        String s2 = s1;
        s1 = s1 + " World";

        System.out.println("String example:");
        System.out.println("s1: " + s1);
        System.out.println("s2 (original): " + s2);

        // StringBuilder (mutable, not thread-safe)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("\nStringBuilder example:");
        System.out.println("StringBuilder content: " + sb.toString());

        // StringBuffer (mutable, thread-safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("\nStringBuffer example:");
        System.out.println("StringBuffer content: " + sbf.toString());
    }
}
