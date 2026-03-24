public class M4Q4 {
    public static void main(String[] args) {
        String original = "Advanced Java";
        StringBuilder builder = new StringBuilder(original);
        String reversed = builder.reverse().toString();

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
}
