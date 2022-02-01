import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaEncryptionDecryption {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);// baaa
        String words = scanner.nextLine();
        scanner.close();

        // Map<Character, Integer> map = new HashMap<Character, Integer>();
        // for (int i = 0; i < words.length(); i++) {
        // char c = words.charAt(i);
        // if (!map.containsKey(c)) {
        // map.put(c, 1);
        // } else {
        // int cnt = map.get(c);
        // map.put(c, ++cnt);
        // }
        // }
        // System.out.println(map);

        int currentCharCount = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length(); i++) {
            for (int k = 0; k < words.length(); k++) {
                if (words.charAt(i) == words.charAt(k)) {
                    currentCharCount++;
                }else{
                    builder.append(words.charAt(i));
                }
            }
            System.out.println(words.charAt(i));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }

        System.out.println(builder.toString());

    }
}
