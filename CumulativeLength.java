package Strings;

import java.util.Scanner;

public class CumulativeLength {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        String[] name = new String[size];
        for(int i=0;i<size;i++){
            name[i]= ip.next();
        }
        int len = 0;
        for(int i=0;i<size;i++){
            len+=name[i].length();
        }
        System.out.println(len);
    }
}
