public class UC5InlineArray {
    public static void main(String[] args) {
        // Step 1: Inline declaration and initialization using String.join()
        String[] banner = {
            String.join(" ", " ", "*** ", "*** ", "****", "****", " "),
            String.join(" ", "*", "  ", "*", "*", "  ", "*", "*", "  ", "*", "*", "  ", "*"),
            String.join(" ", "*", "  ", "*", "*", "  ", "*", "*", "  ", "*", "*", "  ", "*"),
            String.join(" ", "*", "  ", "*", "*", "  ", "*", "****", "*** "),
            String.join(" ", "*", "  ", "*", "*", "  ", "*", "*", "    "),
            String.join(" ", "*", "  ", "*", "*", "  ", "*", "*", "    "),
            String.join(" ", " ", "*** ", " ", "*** ", "*", " ", "****", " ")
        };

        // Step 2: Use an enhanced for-loop to print the finalized array
        for (String row : banner) {
            System.out.println(row);
        }
    }
}