public class String_comresstion {
    public static void main(String[] args) {
        String str = "nnnaaaaapppcccddddeee";
        StringBuilder compressed = new StringBuilder();

        // Initialize count to 1, assuming at least one character is present
        int count = 1;

        // Iterate over the characters of the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is the same as the next character
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                // If same, increment count
                count++;
            } else {
                // If different, append the current character and its count to the compressed string
                compressed.append(str.charAt(i));
                compressed.append(count); 
                // Reset count to 1 for the next character
                count = 1;
            }
        }

        // Print the compressed string
        System.out.println("Compressed string: " + compressed.toString());
    }
}

    

