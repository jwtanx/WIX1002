/*
3. Create another class ShuffleCipher that implements the interface MessageEncoder. The constructor has parameters inputFileName, outputFileNam and N. Define the method encode that Shuffle the text by N times. Each shuffle split the message in half and then combine characters from each half alternately. Example if plain text is abcde, the cipher text will become acbde. Define the method decode that reverse the process of encoding. Create a Tester class to test the program.
 */
package Lab10;

// UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q3ShuffleCipher implements Q2MessageEncoder {

    private String directory = "C:\\Users\\User\\Documents\\NetBeansProjects\\WIX1002\\src\\Lab10\\Source\\";
    private String inputFileName, outputFileName;
    private int N;

    public Q3ShuffleCipher(String inputFileName, String outputFileName, int N) {
        this.inputFileName = directory + inputFileName;
        this.outputFileName = directory + outputFileName;
        this.N = N;
    }

    public void encode() {

        try {
            PrintWriter p = new PrintWriter(new FileOutputStream(outputFileName));
            Scanner s = new Scanner(new FileInputStream(inputFileName));

            System.out.println("Encoded: ");

            while (s.hasNextLine()) {

                String str = s.nextLine();
                char[] firstHalf = new char[str.length() / 2];
                char[] secondHalf = new char[str.length() - (str.length() / 2)];
                String temp = "";

                for (int n = 0; n < N; n++) {
                    for (int i = 0; i < (str.length() / 2); i++) {

                        firstHalf[i] = str.charAt(i);

                    }

                    for (int i = (str.length()/2) + 1, j = 0; i < str.length(); i++, j++) {
                        
                        secondHalf[j] = str.charAt(i);

                    }

                    for (int i = 0; i < firstHalf.length + secondHalf.length; i++) {

                        if (i % 2 == 0) {
                            if(i/2 < firstHalf.length){
                                temp += firstHalf[i/2];
                            }
                        } else {
                            temp += secondHalf[i/2];
                        }

                    }
                }
                p.println(temp);
                System.out.println(temp);
            }
            p.close();
            s.close();

        } catch (FileNotFoundException fnf) {
            System.err.println("File not found!");
        } catch (IOException ioe) {
            System.err.println("");
        }

    }

    public void decode() {
        try {
            Scanner s = new Scanner(new FileInputStream(outputFileName));

            System.out.println("\nDecoded: ");

            while (s.hasNextLine()) {

                String str = s.nextLine();
                char[] firstHalf = new char[str.length() / 2];
                char[] secondHalf = new char[str.length() - (str.length() / 2)];
                String temp = "";
                for (int n = 0; n < N; n++) {
                    for (int i = 0; i < (str.length() / 2); i++) {

                        firstHalf[i] = str.charAt(i);

                    }

                    for (int i = (str.length()/2) + 1, j = 0; i < str.length(); i++, j++) {
                        
                        secondHalf[j] = str.charAt(i);

                    }

                    for (int i = 0; i < firstHalf.length + secondHalf.length; i++) {

                        if (i % 2 == 0) {
                            if(i/2 < firstHalf.length){
                                temp += secondHalf[i/2];
                            }
                        } else {
                            temp += firstHalf[i/2];
                        }

                    }
                }
                System.out.println(temp);
            }

            s.close();
        } catch (FileNotFoundException fnf) {
            System.err.println("File not found");
        }
    }

}
