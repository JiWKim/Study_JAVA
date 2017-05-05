/**
 * Created by USER on 2017-05-05.
 */
import java.util.Scanner;

public class Ch6_ParkingCharges {
    public static Double calculateCharges(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the time you arrived");
        int start_time = sc.nextInt();
        System.out.println("Enter the time you leave");
        int end_time = sc.nextInt();

        int parking_hours=end_time-start_time;
        double parkingCharge;

        if (parking_hours<=3)
            parkingCharge=2;
        else if (parking_hours<=19)
            parkingCharge=2+((parking_hours-3)*0.5);
        else
            parkingCharge=10;

        return parkingCharge;
    }
    public static void main(String[] args){
        System.out.println("Your parking fee is $"+ calculateCharges());
    }
}
