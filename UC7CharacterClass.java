public class UC7CharacterClass {

    // Main driver to render the banner
    public static void main(String[] args) {
        // Initialize our data objects
        CharacterPattern o = new CharacterPattern('O', new String[]{
            " *** ", "* *", "* *", "* *", "* *", "* *", " *** "
        });
        CharacterPattern p = new CharacterPattern('P', new String[]{
            "**** ", "* *", "**** ", "* ", "* ", "* ", "* "
        });
        CharacterPattern s = new CharacterPattern('S', new String[]{
            " ****", "* ", " *** ", "    *", "    *", "    *", "**** "
        });

        // Loop through 7 rows to print horizontally
        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(o.getPatternRow(i)).append("  ");
            sb.append(o.getPatternRow(i)).append("  ");
            sb.append(p.getPatternRow(i)).append("  ");
            sb.append(s.getPatternRow(i));
            System.out.println(sb.toString());
        }
    }

    // Static Inner Class to encapsulate Character Data
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor to initialize the object
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for a specific row of the ASCII pattern
        public String getPatternRow(int row) {
            return pattern[row];
        }

        public char getCharacter() {
            return character;
        }
    }
}