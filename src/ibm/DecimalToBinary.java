package ibm;

import java.util.Scanner;

public class DecimalToBinary {
    public static String findbinary(int n){
        String binary="";
        while(n>0){
            int remainder =n %2;
            binary=remainder+binary;
            n=n/2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find the binary number of ");
        int n=sc.nextInt();
        System.out.println("The binary number of "+n+" is "+findbinary(n));
    }
}
