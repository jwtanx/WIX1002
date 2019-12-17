/*
3. Create another class ShuffleCipher that implements the interface MessageEncoder. The constructor has parameters inputFileName, outputFileNam and N. Define the method encode that Shuffle the text by N times. Each shuffle split the message in half and then combine characters from each half alternately. Example if plain text is abcde, the cipher text will become acbde. Define the method decode that reverse the process of encoding. Create a Tester class to test the program.
 */
package Lab10;

// DONE!

public class Q3TesterClass {
    public static void main(String[] args) {
        
        int N = 15;
        
        Q3ShuffleCipher a = new Q3ShuffleCipher("in.txt", "L10Q3Encoded.txt", N);
        Q3ShuffleCipher b = new Q3ShuffleCipher("L10Q3Encoded.txt", "L10Q3Decoded.txt", N);
        a.encode();
        b.decode();
        
    }
}
