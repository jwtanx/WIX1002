/*
 * 4. Determine whether the password is strng password. A strong password must contain the followings

- At least 8 characters
- At least 1 uppercase character
- At least 1 lowercase character
- At least digit (0-9)
- At least non-alphanumeric characters (space character is not counted)

 */
package Exercise.PastFinalTerm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FT16S1Q4 {

    public static void main(String[] args) {
        
        File password = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Exercise/PastFinalTerm/FT16S1Sources/FT16S1Q4Source.txt");
        
        try{
            Scanner s = new Scanner(new FileInputStream(password));
            
            while (s.hasNextLine()) {
                String p = s.nextLine();

                if (got8Char(p.length()) && gotDigit(p) && gotLower(p) && gotUpper(p) && gotSymbol(p)) {
                    System.out.println("Strong password.");
                } else {
                    System.out.println("Not a strong password.");
                }
            }
            s.close();
        } catch (FileNotFoundException fnf){
            System.err.println("Password file not found.");
        }
        
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
