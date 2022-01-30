public class JavaEncryptionDecryption {
    public static void main(String args[]) {
        String word = "baaa";

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            int currentChatCount = 0;

            if (currentChar == word.charAt(i)) {
                currentChatCount++;
            } else {
                currentChatCount = 0;
            }
            System.out.println("Current Char " + currentChar + "  => Number Of Char " + currentChatCount);
        }
    }
}
