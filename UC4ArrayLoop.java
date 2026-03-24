public class UC4ArrayLoop {
    public static void main(String[] args) {
        // Step 1: Initialize a String array to hold the 7 rows of the banner
        String[] banner = new String[7];

        // Step 2: Populate the array using String.join (building on UC3 logic)
        banner[0] = String.join(" ", " ", "*** ", "*** ", "****", "****", " ");
        banner[1] = String.join(" ", "*", "  ", "*", "*", "  ", "*", "*", "  ", "*", "*", "  ", "*");
        banner[2] = String.join(" ", "*", "  ", "*", "*", "  ", "*", "*", "  ", "*", "*", "  ", "*");
        banner[3] = String.join(" ", "*", "  ", "*", "*", "  ", "*", "****", "*** ");
        banner[4] = String.join(" ", "*", "  ", "*", "*", "  ", "*", "*", "    ");
        banner[5] = String.join(" ", "*", "  ", "*", "*", "  ", "*", "*", "    ");
        banner[6] = String.join(" ", " ", "*** ", " ", "*** ", "*", " ", "****", " ");

        // Step 3: Use an enhanced for-loop to print the entire array
        // This is modular: if the banner was 100 lines, this loop wouldn't change.
        for (String row : banner) {
            System.out.println(row);
        }
    }
}