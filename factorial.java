package FunctionsMethods;

import java.util.Scanner;

public class factorial {
    public static void factorial(int num){
        int fac=1;
        for(int i=num;i>=1;i--){
            fac = fac*i;
        }
        System.out.println(fac);
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        factorial(num);
    }
}
