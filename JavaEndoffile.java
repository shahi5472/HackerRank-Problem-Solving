import java.util.Scanner;

public class JavaEndoffile {
    public static void main(String[] args) {

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner input = new Scanner(System.in);
        String s;
        int cas = 0;

        while (input.hasNext()) {
            s = input.nextLine();
            cas++;
            System.out.println(cas + " " + s);
        }
        input.close();
    }
}
