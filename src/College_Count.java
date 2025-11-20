import java.util.Scanner;

public class College_Count {
    public static void findhigh(int cse,int mech,int ece){
        if(cse>mech && cse>ece){
            System.out.println("Computer Science has highest number of student");
        }
        else if(mech>cse && mech>ece){
            System.out.println("Mechanical department has highest number of student");
        }
        else if (ece>cse && ece>mech){
            System.out.println("Electrical department has highest number of student");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of the Student in CSE");
        int cse=sc.nextInt();
        System.out.println("Enter no of the Student in MECH");
        int mech =sc.nextInt();
        System.out.println("Enter no of the Student in ECE");
        int ece=sc.nextInt();

        if(cse <0 || mech<0 || ece<0){
            System.out.println("Invalid input");
        }
        else if(cse==mech && mech==ece){
            System.out.println("All Branch has same student");
        }
        else{
            findhigh(cse,mech,ece);
        }
    }
}
