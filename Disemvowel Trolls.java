public class Troll {
    public static String disemvowel(String str) {
        // Define the vowels to be removed
        String vowels = "aeiouAEIOU";
        
        // Create a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();
        
        // Iterate through each character in the input string
        for (char c : str.toCharArray()) {
            // Check if the character is a vowel
            if (vowels.indexOf(c) == -1) {
                // Append non-vowel characters to the result
                result.append(c);
            }
        }
        
        // Convert the StringBuilder to a string and return it
        return result.toString();
    }
}