public class UC6StaticFunctions {

    public static void main(String[] args) {
        // Step 1: Initialize the array by calling static methods for each row
        String[] banner = {
            getRow(0), getRow(1), getRow(2), getRow(3), getRow(4), getRow(5), getRow(6)
        };

        // Step 2: Render using the loop
        for (String row : banner) {
            System.out.println(row);
        }
    }

    // Helper method to construct each specific row of the "OOPS" banner
    public static String getRow(int rowNum) {
        String o = getO(rowNum);
        String p = getP(rowNum);
        String s = getS(rowNum);
        
        // We join the character parts for that specific row
        return String.join("   ", o, o, p, s);
    }

    public static String getO(int row) {
        String[] oPattern = {
            " *** ", "* *", "* *", "* *", "* *", "* *", " *** "
        };
        return oPattern[row];
    }

    public static String getP(int row) {
        String[] pPattern = {
            "**** ", "* *", "**** ", "* ", "* ", "* ", "* "
        };
        return pPattern[row];
    }

    public static String getS(int row) {
        String[] sPattern = {
            " ****", "* ", " *** ", "    *", "    *", "    *", "**** "
        };
        return sPattern[row];
    }
}