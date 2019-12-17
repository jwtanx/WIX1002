/*
3. Create another class ShuffleCipher that implements the interface MessageEncoder. The constructor has parameters inputFileName, outputFileNam and N. Define the method encode that Shuffle the text by N times. Each shuffle split the message in half and then combine characters from each half alternately. Example if plain text is abcde, the cipher text will become acbde. Define the method decode that reverse the process of encoding. Create a Tester class to test the program.
 */
package Lab10;

// UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE UNDONE
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q3ShuffleCipher implements Q2MessageEncoder {

    private String directory = "C:\\Users\\User\\Documents\\NetBeansProjects\\WIX1002\\src\\Lab10\\Source\\";
    private String inputFileName, outputFileName;
    private String tempDecode, tempEncode;
    private int N;

    public Q3ShuffleCipher(String inputFileName, String outputFileName, int N) {
        this.inputFileName = directory + inputFileName;
        this.outputFileName = directory + outputFileName;
        tempEncode = directory + "tempEncode.txt";
        tempDecode = directory + "tempDecode.txt";
        this.N = N;
    }

    public void encode() {

        // Copy
        try {
            Scanner s = new Scanner(new FileInputStream(inputFileName));
            PrintWriter p = new PrintWriter(new FileOutputStream(tempEncode));

            while (s.hasNextLine()) {

                p.println(s.nextLine());

            }

            p.close();
            s.close();
        } catch (FileNotFoundException fnf) {
            System.err.println("File not found!");
        } catch (IOException e) {
            System.err.println("Problem with writing file!");
        }
        String tempFile = "";
        try {
            for (int c = 0; c < N; c++) {
                if (c != 0) {
                    tempFile = outputFileName;
                    outputFileName = tempEncode;
                    tempEncode = tempFile;
                }

                Scanner s = new Scanner(new FileInputStream(tempEncode));
                PrintWriter p = new PrintWriter(new FileOutputStream(outputFileName));

//                System.out.println("\nEncoded: ");

                while (s.hasNextLine()) {

                    String str = s.nextLine();
                    String firstHalf = str.substring(0, str.length() / 2);
                    String secondHalf = str.substring(str.length() / 2);
                    String encoded = "";

                    for (int i = 0; i < str.length(); i++) {

                        // If string length is even
                        if (str.length() % 2 == 0) {
                            if (i % 2 == 0) {
                                if (i / 2 < firstHalf.length()) {
                                    encoded += firstHalf.charAt(i / 2);
                                }

                            } else {
                                encoded += secondHalf.charAt(i / 2);
                            }
                        } else {
                            if (i == str.length() - 1) {
                                encoded += str.charAt(str.length() - 1);
                            } else {
                                if (i % 2 == 0) {
                                    if (i / 2 < firstHalf.length()) {
                                        encoded += firstHalf.charAt(i / 2);
                                    }
                                } else {
                                    encoded += secondHalf.charAt(i / 2);
                                }
                            }
                        }
                    }
                    p.println(encoded);
//                    System.out.println(encoded);
                }
                p.close();
                s.close();
            }
        } catch (FileNotFoundException fnf) {
            System.err.println("File not found!");
        } catch (IOException ioe) {
            System.err.println("");
        }

    }

    public void decode() {
        String tempFile = "";
        try {
            for (int c = 0; c < N; c++) {
                if (c == 0) {
                    tempDecode = inputFileName;
                } else {
                    tempFile = outputFileName;
                    outputFileName = tempDecode;
                    tempDecode = tempFile;
                }

                Scanner s = new Scanner(new FileInputStream(tempDecode));
                PrintWriter p = new PrintWriter(new FileOutputStream(outputFileName));

//                System.out.println("\nDecoded: ");

                while (s.hasNextLine()) {

                    String code = s.nextLine();
                    String firstHalf = "";
                    String secondHalf = "";
                    String decoded = "";

                    for (int i = 0; i < code.length(); i++) {

                        if (code.length() % 2 == 0) {
                            if (i % 2 == 0) {
                                firstHalf += code.charAt(i);
                            } else {
                                secondHalf += code.charAt(i);
                            }
                        } else {
                            if (i == code.length() - 1) {
                                secondHalf += code.charAt(code.length() - 1);
                            } else {
                                if (i % 2 == 0) {
                                    firstHalf += code.charAt(i);
                                } else {
                                    secondHalf += code.charAt(i);
                                }
                            }
                        }
                    }
                    decoded = firstHalf + secondHalf;
                    p.println(decoded);
//                    System.out.println(decoded);
                }

                p.close();
                s.close();

            }
        } catch (FileNotFoundException fnf) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Problem with writing ");
        }
        
        File encode = new File(tempEncode);
        if(encode.delete()){
            System.err.println("Deleted Temp Encode.");
        }
        
    }

}
