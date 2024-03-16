import java.util.Scanner;

public class hollow_rectangle {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int col = ip.nextInt();
        int row = ip.nextInt();
        for(int i =0;i<=row;i++){
            for(int j=0;j<=col;j++){
                if(i==0 || j==0||i==row||j==col){
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
