/*
 * 4. Determine whether the password is strng password. A strong password must contain the followings

- At least 8 characters
- At least 1 uppercase character
- At least 1 lowercase character
- At least digit (0-9)
- At least non-alphanumeric characters (space character is not counted)

 */
package Exercise.PastFinalTerm;

/**
 *
 * @author User
 */
// NEED UPDATE AFTER LEARNT GETTING FILE TXT
public class FT16S1Q4 {

    public static void main(String[] args) {

        // Setting password
        String p = "abAc1234@";

        if (got8Char(p.length()) && gotDigit(p) && gotLower(p) && gotUpper(p) && gotSymbol(p)) {
            System.out.println("Strong password.");
        } else {
            System.out.println("Not a strong password.");
        }
        
        System.out.println("\nDone @ 311019, 20:00");
    }

    public static boolean got8Char(int l) {

        if (l >= 8) {
            return true;
        }
        return false;

    }

    public static boolean gotUpper(String pw) {

        for (int i = 0; i < pw.length(); i++) {

            if (Character.isUpperCase(pw.charAt(i))) {
                return true;
            }

        }

        return false;

    }

    public static boolean gotLower(String pw) {

        for (int i = 0; i < pw.length(); i++) {

            if (Character.isLowerCase(pw.charAt(i))) {
                return true;
            }

        }

        return false;

    }

    public static boolean gotDigit(String pw) {

        for (int i = 0; i < pw.length(); i++) {

            if (Character.isDigit(pw.charAt(i))) {
                return true;
            }

        }

        return false;

    }

    public static boolean gotSymbol(String pw) {

        for (int i = 0; i < pw.length(); i++) {

            if (Character.toString(pw.charAt(i)).matches("^\\W*$")) {
                return true;
            }

        }

        return false;

    }
}
