import java.util.HashMap;
import java.util.Map;

public class UC8FinalApp {

    // Centralized Pattern Repository
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // Populating the Map with character-to-pattern mappings
        patternMap.put('O', new String[]{
            " *** ", "* *", "* *", "* *", "* *", "* *", " *** "
        });
        patternMap.put('P', new String[]{
            "**** ", "* *", "**** ", "* ", "* ", "* ", "* "
        });
        patternMap.put('S', new String[]{
            " ****", "* ", " *** ", "    *", "    *", "    *", "**** "
        });
    }

    public static void main(String[] args) {
        // Execute the rendering function for the word "OOPS"
        renderBanner("OOPS");
    }

    /**
     * Function to assemble and render the banner dynamically
     * @param word The string to be converted into ASCII art
     */
    public static void renderBanner(String word) {
        // We need to print 7 rows
        for (int i = 0; i < 7; i++) {
            StringBuilder rowBuilder = new StringBuilder();
            
            // Loop through each character in the word
            for (char c : word.toUpperCase().toCharArray()) {
                if (patternMap.containsKey(c)) {
                    rowBuilder.append(patternMap.get(c)[i]).append("  ");
                }
            }
            // Print the assembled row
            System.out.println(rowBuilder.toString());
        }
    }
}