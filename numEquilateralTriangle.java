import java.util.Scanner;

public class numEquilateralTriangle {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j =n-i;j>=n/2;j--){
                System.out.print(" ");
            }
            for(int j =0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
