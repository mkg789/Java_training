package AdvancePattern;

import java.util.Scanner;

public class hollowButterfly {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if ((i+j)==(i+1)||(i+j)==i*2) {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j = 2*(n-i);j>0;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                if ((i+j)==(i+1)||(i+j)==i*2) {
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
        for(int i = n;i>0;i--){
            for(int j = 1;j<=i;j++){
                if ((i+j)==(i+1)||(i+j)==i*2) {
                    System.out.print("*");
                    }
                else{
                    System.out.print(" ");
                }
            }
            for(int j = 2*(n-i);j>0;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                if ((i+j)==(i+1)||(i+j)==i*2) {
                    System.out.print("*");
                    }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
