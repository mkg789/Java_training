import java.util.Scanner;

/**
 * palindromicNumberPyramid
 */
public class palindromicNumberPyramid {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j =n-i;j>=n/2;j--){
                System.out.print(" ");
            }
            for(int j = i;j>0;j--){
                System.out.print(j);
            }
            for(int j= 2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}