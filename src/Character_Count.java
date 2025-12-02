import java.util.Scanner;

public class Character_Count {
    public static int charCount(String str,char c){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        System.out.println("Enter the character to find");
        char c=sc.next().charAt(0);

        int result=charCount(str,c);
        System.out.println(result);
    }
}
