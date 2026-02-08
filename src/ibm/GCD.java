package ibm;

import java.util.Scanner;

public class GCD {
    public static int findGCD(int a,int b){
        if(b==0){
            return a;
        }
        return findGCD(b,a%b);
    }
    public static void main(String[] args) {
        int a=48,b=18;
        System.out.println("GCD of a: "+a+",b: "+b+" is: "+findGCD(a,b));
    }
}
