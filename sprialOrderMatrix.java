package Arrays;

import java.util.Scanner;

/**
 * sprialOrderMatrix
 */
public class sprialOrderMatrix {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int row = ip.nextInt();
        int col = ip.nextInt();
        int num[][]= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                num[i][j]=ip.nextInt();
            }
        }
        int colStart=0;
        int colEnd=col-1;
        int rowStart=0;
        int rowEnd=row-1;
        while (colEnd>=colStart && rowEnd>=rowStart) {
            for(int coli = colStart;coli<colEnd;coli++){
                System.out.print(num[rowStart][coli]);
            }
            for(int rowj = rowStart;rowj<rowEnd;rowj++ ){
                System.out.print(num[rowj][colEnd]);
            }
            for(int coli = colEnd;coli>colStart;coli--){
                System.out.print(num[rowEnd][coli]);
            }
            for(int rowj=rowEnd; rowj>rowStart;rowj--){
                System.out.print(num[rowj][colStart]);
            }
            colStart++;
            rowStart++;
            colEnd--;
            rowEnd--;

        }
    }
}