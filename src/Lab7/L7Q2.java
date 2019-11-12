/*
 * 2. The code below is used to read the contents of a Web page. Write the contents of the Web page into
a text file name index.htm
 */
package Lab7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L7Q2 {

    public static void main(String[] args) {

        try {
            URL u = new URL("http://www.fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);

            File f = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Lab7/Files/index.htm");

            PrintWriter outHTM = new PrintWriter(new FileOutputStream(f));

            while (in.hasNextLine()) {
                outHTM.println(in.nextLine());
            }

            in.close();
            outHTM.close();

        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }

    }
}
