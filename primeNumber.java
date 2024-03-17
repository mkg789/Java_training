package FunctionsMethods;

import java.util.Scanner;

public class primeNumber {
    public static Boolean primeNum(int num){
        for(int i =2;i<num;i++){
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        System.out.println(primeNum(num));
    }
}
