import java.util.*;

public class rectange_pattern {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int m = ip.nextInt();
        for(int i = 0;i<n;i++){
            for(int j=1;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}