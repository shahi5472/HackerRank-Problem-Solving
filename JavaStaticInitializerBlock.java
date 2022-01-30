import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static Scanner src = new Scanner(System.in);

    static int B = src.nextInt();
    static int H = src.nextInt();
    static boolean flag = true;

    static {
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    public static void main(String args[]) {
        if(flag){
			int area=B*H;
			System.out.print(area);
		}
    }
}
