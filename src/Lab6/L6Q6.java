/*
 * 6. Write a Java method that determine whether a number is a palindromic prime and another method that determine whether a number is emirp (the number is a prime number and the reverse also a prime number and is not palindromic prime). Then, write a Java program to use the methods to display the first 20 palindromic prime and emirp. 
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L6Q6 {

    public static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(int n) {

        int num = n;
        int rev = 0;

        while (num > 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }

        if (rev == n && isPrime(rev)) {
            return isPrime(rev);
        } else {
            return false;
        }

    }

    public static boolean isEmirp(int n) {

        int num = n;
        int rev = 0;

        while (num > 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }

        if (rev != n && isPrime(rev)) {
            return isPrime(rev);
        } else {
            return false;
        }

    }

    public static int[] palindromeList(int n) {

        int i = 0;
        int num = 3;
        int[] pList = new int[n];

        while (i < n) {

            if (isPrime(num)) {
                if (isPalindrome(num)) {
                    pList[i] = num;
                    i++;
                }
            }
            num++;
        }

        return pList;
    }

    public static int[] emirpList(int n) {

        int i = 0;
        int num = 3;
        int[] eList = new int[n];

        while (i < n) {

            if (isPrime(num)) {
                if (isEmirp(num)) {
                    eList[i] = num;
                    i++;
                }
            }
            num++;
        }

        return eList;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of Palindrome Prime and Emirp to be displayed: ");
        int n = s.nextInt();

        int[] getPnumList = palindromeList(n);
        int[] getEmirpList = emirpList(n);

        System.out.print("\nPalindrome list\t: ");
        for (int p = 0; p < getPnumList.length; p++) {

            if (p == getPnumList.length - 1) {
                System.out.print(getPnumList[p]);
            } else {
                System.out.print(getPnumList[p] + ", ");
            }

        }

        System.out.print("\nEmirp list\t: ");
        for (int e = 0; e < getEmirpList.length; e++) {

            if (e == getEmirpList.length - 1) {
                System.out.print(getEmirpList[e]);
            } else {
                System.out.print(getEmirpList[e] + ", ");
            }

        }

        System.out.println("\n\nDone @ 211019, 22:41");

    }
}
