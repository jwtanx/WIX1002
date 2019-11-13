/*
 * 6. Write programs that merge data from two text files namely product.txt and order.txt. (Please download the text file from the Web site.)
The product.txt contains the ProductID, ProductName, ProductPrice separated by comma.
The order.txt contains the OrderID, ProductID, OrderQuantiy separated by comma.
You program will display the ProductID, ProductName, OrderQuantity, PricePerUnit and TotalPrice for each order.
(You can use the String.split(), Integer.parseInt(String) and Double.parseDouble(String)) 
 */
package Lab7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L7Q6 {

    public static void main(String[] args) {

        int numberOfProduct = 0;

        try {

            File product = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Lab7/Files/Source/product.txt");
            File order = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Lab7/Files/Source/order.txt");

            // Counting product
            Scanner s = new Scanner(new FileInputStream(product));

            while (s.hasNextLine()) {
                s.nextLine();
                numberOfProduct++;
            }
            s.close();

            // Getting the list of products
            String[] list = new String[numberOfProduct];
            s = new Scanner(new FileInputStream(product));

            for (int i = 0; i < numberOfProduct; i++) {
                list[i] = s.nextLine();
            }
            s.close();

            // Storing info and details
            // productInfo[][0] = ProductID
            // productInfo[][1] = ProductName
            // productInfo[][2] = ProductPrice
            String[][] productInfo = new String[numberOfProduct][];

            for (int i = 0; i < numberOfProduct; i++) {
                productInfo[i] = list[i].split(",");
            }

            ///////////////////////////////////////////////////////////////////////////////////////////
            // Counting order
            int numberOfOrder = 0;
            s = new Scanner(new FileInputStream(order));
            while (s.hasNextLine()) {
                s.nextLine();
                numberOfOrder++;
            }
            s.close();

            // Getting the list of order
            String[] orderList = new String[numberOfOrder];
            s = new Scanner(new FileInputStream(order));

            for (int i = 0; i < numberOfOrder; i++) {
                orderList[i] = s.nextLine();
            }
            s.close();

            // Storing info and details
            // orderInfo[][0] = OrderID
            // orderInfo[][1] = ProductID
            // orderInfo[][2] = OrderQuantity
            String[][] orderInfo = new String[numberOfOrder][];

            for (int i = 0; i < numberOfOrder; i++) {
                orderInfo[i] = orderList[i].split(",");
            }

            // Display the ProductID, ProductName, OrderQuantity, PricePerUnit and TotalPrice for each order.
            // The product.txt contains the ProductID, ProductName, ProductPrice separated by comma.
            // The order.txt contains the OrderID, ProductID, OrderQuantiy separated by comma.
            System.out.println("Product ID\tProduct Name\t\tOrder Quantity\t\tPrice per unit\t\tTotal Price");
            for (int i = 0; i < numberOfOrder; i++) {
                for (int j = 0; j < numberOfProduct; j++) {
                    if (orderInfo[i][1].equalsIgnoreCase(productInfo[j][0])) {
                        int orderQuantity = Integer.parseInt(orderInfo[i][2]);
                        double pricePerUnit = Double.parseDouble(productInfo[j][2]);
                        double totalPrice = orderQuantity * pricePerUnit;

                        System.out.printf("%s\t\t%.15s\t\t%d\t\t\t%.2f\t\t\t%.2f\n", productInfo[i][0], productInfo[i][1], orderQuantity, pricePerUnit, totalPrice);

                    }
                }
            }

        } catch (FileNotFoundException FNF) {
            System.err.println("File not found!");
        }

    }
}
