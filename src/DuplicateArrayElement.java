import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateArrayElement {
    public static void findDuplicate(int n,int arr[]){
        List<Integer>list= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            boolean a=false;
            for(int j=i+1;j<n;j++){
               if(arr[i]==arr[j]){
                   a=true;
               }
            }
            if(!a){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array length");
        int n=sc.nextInt();
        System.out.println("Enter the array element");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findDuplicate(n,arr);
    }
}
