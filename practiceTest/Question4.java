package practiceTest;
import java.util.Scanner;

public class Question4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No. you want to Divide: ");
        double dividend = scan.nextDouble();
        System.out.println("Enter No. you want to Divide by : ");
        double divisor = scan.nextDouble();
        scan.close();

        try {
            if (divisor == 0) {
                throw new DivisionByZeroException("Can't Divide by Zero");
            } else {
                double result = dividend / divisor;
                System.out.println(result);
            }
        } catch (DivisionByZeroException e) {
            System.err.println(e);
        }

    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String msg) {
        super(msg);
    }
}