import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();   
        sc.close();         
        if(n%2==1 || ( (n%2==0) && (n>=6 && n <= 20 ) ) ){
         System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }
}
