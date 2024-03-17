package FunctionsMethods;

import java.util.Scanner;

public class Table {
    public static void table(int num){
        for(int i=0;i<11;i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        table(num);
    }
}
