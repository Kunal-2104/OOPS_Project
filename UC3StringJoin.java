public class UC3StringJoin {
    public static void main(String[] args) {
        // Constructing the "OOPS" banner using String.join for memory efficiency
        System.out.println(String.join(" ", " ", "***", "***", "****", "****", ""));
        System.out.println(String.join(" ", "*", "  ", "*", "*", "  ", "*", "*", "  ", "*", "*", "  ", "*"));
        System.out.println(String.join(" ", "*", "  ", "*", "*", "  ", "*", "*", "  ", "*", "*", "  ", "*"));
        System.out.println(String.join(" ", "*", "  ", "*", "*", "  ", "*", "****", "***"));
        System.out.println(String.join(" ", "*", "  ", "*", "*", "  ", "*", "*", "    "));
        System.out.println(String.join(" ", "*", "  ", "*", "*", "  ", "*", "*", "    "));
        System.out.println(String.join(" ", " ", "***", " ", "***", "*", " ", "****", ""));
    }
}