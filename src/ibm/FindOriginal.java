package ibm;

import java.util.Scanner;

public class FindOriginal {
    public static int[] findOriginalArray(int[] pref){
        int n= pref.length;
        int[] arr=new int[n];
        arr[0]=pref[0];
        for(int i=1;i<n;i++){
            arr[i]=pref[i]^pref[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] pref={3,5,2,10};
        int[] original=findOriginalArray(pref);
        for(int i:original){
            System.out.print(i+" ");
        }
    }
}
