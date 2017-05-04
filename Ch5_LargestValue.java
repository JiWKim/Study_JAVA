/**
 * Created by USER on 2017-05-04.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Ch5_LargestValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input_num;
        int largest_num;
        ArrayList<String> num_list = new ArrayList<String>();

        while (true) {
            System.out.println("Input an integer");
            input_num = sc.next();
            num_list.add(input_num);
            largest_num = Integer.parseInt(num_list.get(0));

            for (int i = 0; i < num_list.size(); i++)
                if (Integer.parseInt(num_list.get(i)) > largest_num)
                    largest_num = Integer.parseInt(num_list.get(i));

            System.out.println("You have entered ");
            for (int j=0; j<num_list.size();j++)
                System.out.println(num_list.get(j));
            System.out.println("The largest value among your inputs is " + largest_num);
            System.out.println("In order to exit this while loop enter Ctrl-C");
        }
    }
}
