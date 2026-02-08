package ibm;

import java.util.Scanner;

public class FibonacciTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows to find ");
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                int c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
