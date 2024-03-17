package AdvancePattern;

import java.util.Scanner;

class DiamondPattern {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i = n;i>0;i--){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    
}