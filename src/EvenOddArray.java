import java.util.Scanner;

public class EvenOddArray {
    public static void evenOdd(int n,int[] arr){
        for(int i=0;i<n;i++){
            if(arr[i]%2==0) {
                System.out.print("Even ");
            }
            else{
                System.out.print("odd ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int n=sc.nextInt();
        System.out.println("Enter the array element ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        evenOdd(n,arr);
    }
}
