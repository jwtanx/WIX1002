/*
 * You probably can’t hide an elephant in your room, but you can hide one in a sentence. Let’s start small. Can you find the goat that is hiding in the sentence below? Lisa will go at dinner time. The two words go at spell goat when you put them together.

Now, find these animals in the sentences below.
ape 	rat 	dog	hen 
deer 	kitten 	 bear 	pony 
horse 	owl 	lamb 	mice

Sentences:
1. Go fish or see what we have to eat in the refrigerator. 
2. Be artistic and paint a picture for me. 
3. She needs a new cover for her book. 
4. Tom iced the cake for the birthday party. 
5. Do girls like soccer or baseball? 
6. Ms. Dee read a book to the class. 
7. What a big bowl of noodles you have! 
8. Hop on your bicycle and let’s go for a ride. 
9. Jess took a peek into the package. 
10. “Slam bam!” the ball hit the rim with a crash! 
11. Jay did kick it ten times in row. 
12. Please have dinner at my house on Monday

Create a system that accepts the animal as user input and a sentence. In that sentence, check if the specified animal is found in the sentence.
Create a system that accepts animas as user input. Match the series of animals and with the suitable sentences that have been stored in the program.  

 */
package Exercise.MidTerm2019;

/**
 *
 * @author User
 */
public class LQ2 {

    public static void main(String[] args) {

        // sentence.length = 12;
        String sentence[]
                = {
                    "Go fish or see what we have to eat in the refrigerator.",
                    "Be artistic and paint a picture for me.",
                    "She needs a new cover for her book.",
                    "Tom iced the cake for the birthday party.",
                    "Do girls like soccer or baseball?",
                    "Ms. Dee read a book to the class.",
                    "What a big bowl of noodles you have!",
                    "Hop on your bicycle and let’s go for a ride.",
                    "Jess took a peek into the package.",
                    "\"Slam bam!\" the ball hit the rim with a crash!",
                    "Jay did kick it ten times in row.",
                    "Please have dinner at my house on Monday."
                };

        String nospace[] = new String[sentence.length];

        String animal[]
                = {
                    "ape",
                    "rat",
                    "dog",
                    "hen",
                    "deer",
                    "kitten",
                    "bear",
                    "pony",
                    "horse",
                    "owl",
                    "lamb",
                    "mice",};

        int position[] = new int[sentence.length];

        // Joining all word together for each String
        for (int i = 0; i < sentence.length; i++) {
            nospace[i] = (sentence[i].replaceAll(" ", "")).toLowerCase();
        }

        // Searching each animal name string by string
        for (int i = 0; i < animal.length; i++) {

            // Looking though string by string
            for (int j = 0; j < nospace.length; j++) {

                if (nospace[j].contains(animal[i])) {
                    position[i] = j;
                }

            }
        }

        for (int i = 0; i < position.length; i++) {
            System.out.printf("Animal \"%s\"\tis in sentence \"%s\"\n", animal[i], sentence[position[i]]);
        }

        System.out.println("\nDone on 251019, 21:45");
        
    }
}
