/**
 * Created by USER on 2017-05-17.
 */
import java.util.Scanner;

class number1 {
    public static void isEven(int num1){
        if(num1%2==0)
            System.out.println(num1+" is EVEN");
        else
            System.out.println(num1+" is NOT EVEN");
    }
    public static void isOdd(int num1){
        if(num1%2==1)
            System.out.println(num1+" is ODD");
        else
            System.out.println(num1+" is NOT ODD");
    }
}
class number2 {
    int num2;
    public void setNumber(int num2){
        this.num2 = num2;
    }
    public void isEven(){
        if(num2%2==0)
            System.out.println(num2+" is EVEN");
        else
            System.out.println(num2+" is NOT EVEN");
    }
    public void isOdd(){
        if(num2%2==1)
            System.out.println(num2+" is ODD");
        else
            System.out.println(num2+" is NOT ODD");
    }
}
public class Ch6_EvenorOdd {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int x1 = sc.nextInt();

        number1.isEven(x1);
        number1.isOdd(x1);

        number2 n2 = new number2();
        System.out.println("Enter an Integer");
        int x2 = sc.nextInt();
        n2.setNumber(x2);
        n2.isEven();
        n2.isOdd();

    }
}
