import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "Brown jars prevented the mixture from freezing too quickly";
        
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    
    public static boolean isPangram(String input) {
        // Convert input to lowercase for case-insensitive comparison
        input = input.toLowerCase();
        
        // Create a set to store unique alphabets
        Set<Character> alphabets = new HashSet<>();
        
        // Iterate through each character in the input
        for (char c : input.toCharArray()) {
            // Check if the character is an alphabet
            if (Character.isAlphabetic(c)) {
                // Add the alphabet to the set
                alphabets.add(c);
            }
        }
        
        // Check if the set contains all 26 alphabets
        return alphabets.size() == 26;
    }
}
