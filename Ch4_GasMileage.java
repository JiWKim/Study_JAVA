/**
 * Created by USER on 2017-05-01.
 */

import java.util.Scanner;

public class Ch4_GasMileage
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int mile;
        int gallon;
        double mile_per_gallon;
        int total_mile=0;
        int total_gallon=0;
        double total_mile_per_gallon;

        while (true) {
            System.out.println("Enter the miles driven: ");
            mile = sc.nextInt();
            total_mile = total_mile + mile;

            System.out.println("Enter the gallons used: ");
            gallon = sc.nextInt();
            total_gallon = total_gallon + gallon;

            mile_per_gallon = (double) mile / (double) gallon;
            System.out.println("Mile per gallon for this trip is " + mile_per_gallon);

            total_mile_per_gallon = (double) total_mile / (double) total_gallon;
            System.out.println("Total miles driven is " + total_mile);
            System.out.println("Total gallons used is " + total_gallon);
            System.out.println("Total mile per gallon is " + total_mile_per_gallon);


            System.out.println("In order to exit this while loop enter Ctrl-C");

        }
    }
}
