import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int user;
        do{
            int marks = ip.nextInt();
            if (marks>=90) {
                System.out.println("This is good");
            }
            else if (marks<90 && marks>60) {
                System.out.println("This is also good");
            }
            else{
                System.out.println("This is good as well");
            }
            System.out.println("Have more marks to upload? Yes:1, No:2");
            user=ip.nextInt();
        }while(user==1);
    }
}
