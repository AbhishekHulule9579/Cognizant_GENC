import java.net.StandardSocketOptions;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FuelComsumption {
    public static void main(String[] args) {
        DecimalFormat df2=new DecimalFormat("0.00");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        int liter= sc.nextInt();
        double liters=(liter*1.00);
        if(liter<1){
            System.out.println(liter+" is an invalid Input");
            System.exit(0);
        }
        System.out.println("Enter the distance covered");
        int distance= sc.nextInt();
        double dis=(distance*1.00);
        if(distance<1){
            System.out.println(distance+" is invalid input");
            System.exit(0);
        }
        double hundread=((liters/dis)*100);
        System.out.println("Liters/100KM");
        System.out.println(df2.format(hundread));

        double miles=(dis*0.6214);
        double gallons=(liters*0.2642);
        double mg=miles/gallons;
        System.out.println("Miles/Gallons");
        System.out.println(df2.format(mg));
    }
}
