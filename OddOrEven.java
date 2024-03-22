import java.util.*;
public class OddOrEven {
    public static void main(String arg[]){
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        // checking even condition
        if(a%2==0){
            System.out.print(a);
        }
        else{
            System.out.print("odd");
        }
    }
}
