/*
 * 3. Biologist uses a sequence of letters A, C, Tand G to model a genome. A gene is a substring of a genome that starts after a triplet ATG and ends before a triplet of TAG, TAA or TGA. Furthermore, the length of a gene string is a multiple of 3 and the gene does not contain any of the triplets ATG, TAG, TAA and TGA. Write a program that asks the user to enter a genome and displays all genes in the genome. (Save the program in the Main.java file. 

Sample output: 
Enter genome string (quit to stop) : TTATGTTTTAAGGATGGGGCGTTAGTT 
TTT
GGGCGT 
Enter genome string (quit to stop) : GGTATGATGGGTTGA 
GGT 
Enter genome string (quit to stop) : ATGTGA 
No gene in found 
Enter gename string [quit to stop] : ATGTTTGTAA 
No gene is found 
Enter genome atring (quit to stop] : TGGATGTATATA 
No gene is found 
Enter genome string [quit to stop) : quit
 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT19S1Q3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String genome = "";
        while (!genome.equalsIgnoreCase("quit")) {
            System.out.print("Enter genome string (quit to stop) : ");
            genome = s.nextLine();

            if (genome.equalsIgnoreCase("quit")) {
                break;
            }

            if (!checkValid(genome)) {
                System.out.println("No gene is found.");
            } else {
                for (int i = 0; i < genome.length() - 2; i++) {
                    if (genome.substring(i, i + 3).equals("ATG")) {
                        String temp = "";
                        for (int j = i; j < genome.length(); j++) {
                            temp += genome.charAt(j);

                            if (temp.length() >= 6 && (temp.contains("TAG") || temp.contains("TAA") || temp.contains("TGA"))) {
                                
                                if(temp.equals(genome)){
                                    System.out.println("No gene is found.");
                                    break;
                                }
                                
                                temp = temp.replaceAll("TAG", "");
                                temp = temp.replaceAll("TAA", "");
                                temp = temp.replaceAll("TGA", "");
                                temp = temp.replaceAll("ATG", "");
                                if(temp.equals("")){
                                    break;
                                } else {
                                    System.out.println(temp);
                                    break;
                                }

                            } else if (j == genome.length() - 1){
                                if(!(temp.contains("TAG") || temp.contains("TAA") || temp.contains("TGA"))){
                                    System.out.println("No gene is found.");
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean checkValid(String g) {
        return g.length() % 3 == 0;
    }
}
