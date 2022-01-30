import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result = 0;
        in.close();
        for (int i = 1; i <= 10; i++) {
            result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}
