/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
     * This class needs to be fixed.
*/
public class ReclamationProject {

    /**
     *@param s1 some String value.
     *@param s2 some String value.
     *@return r return string.
     */
    public static String longestCommonSubstring(final String s1, final String s2) {
        String a = s1;
        String b = s2;

        if (s1.length() > s2.length()) {
            String c = s1;
            a = b;
            b = c;
        }

        String r = "";

        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if ((a.regionMatches(i, b, k, j) && j > r.length())) {
                        r = (a.substring(i, i + j));
                    }
                }
            }
        }
        return r;
    }
}
