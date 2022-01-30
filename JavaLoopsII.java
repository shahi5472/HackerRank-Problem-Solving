import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class JavaLoopsII {
    public static void main(String[] argh) {
        Scanner input = new Scanner(System.in);

        int q = input.nextInt();
        int a, b, n;

        var v = new Vector();

        int res = 0;

        for (int i = 0; i < q; i++) {
            a = input.nextInt();
            b = input.nextInt();
            n = input.nextInt();

            for (int j = 0; j < n; j++) {
                res += a;

                for (int k = 0; k <= j; k++) {
                    res += (java.lang.Math.pow(2, k) * b);
                }
                v.add(res);
                res = 0;
            }

            Enumeration vEnum = v.elements();

            while (vEnum.hasMoreElements()) {
                System.out.print(vEnum.nextElement() + " ");
            }
            System.out.println();
            v.clear();
        }

    }
}
