/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10;

/**
 *
 * @author User
 */
public class Q2TesterClass {
    public static void main(String[] args) {
        
        Q2SubstitutionCipher a = new Q2SubstitutionCipher("in.txt", "out.txt", 10);
        a.encode();
        a.decode();
        
    }
}
