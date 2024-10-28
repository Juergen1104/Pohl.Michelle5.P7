public class Letters {

    // Aufgabenteil (a)


    // Aufgabenteil (b)
    public static void addLetter(StringBuffer sBuf, char c){
        
    }


    // Aufgabenteil (c)
    public static void checkSharedLetters(String w1, String w2) {
        StringBuffer sharedLetters = new StringBuffer();
        StringBuffer uniqueLettersW1 = new StringBuffer();
        StringBuffer uniqueLettersW2 = new StringBuffer();

        
        
        System.out.println("Word 1: " + w1);
        System.out.println("Word 2: " + w2);
        System.out.println("Shared letters: ");            // Ausgabe ergänzen!
        System.out.println("Unique letters of word 1: ");  // Ausgabe ergänzen!
        System.out.println("Unique letters of word 2: ");  // Ausgabe ergänzen!

    }

    public static void main(String[] args) {
        if (args.length == 2) {
            // Aufgabenteil (d): Aufruf von checkSharedLetters ergänzen
        } else {
            System.out.println("Call: \njavaSharedLetters <word1> <word2>");
        }
    }
}
