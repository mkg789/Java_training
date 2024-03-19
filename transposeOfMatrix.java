package Arrays;

import java.util.Scanner;

/**
 * transposeOfMatrix
 */
public class transposeOfMatrix {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int row = ip.nextInt();
        int col = ip.nextInt();
        int[][] num = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                num[i][j]=ip.nextInt();
            }
        }
        int end =0;
        while (end < col) {
            for(int i=0;i<row;i++){
                System.out.print(num[i][end]+" ");
            }
            System.out.println();
            end++;
        }
    }
}