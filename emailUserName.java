package Strings;

import java.util.Scanner;

public class emailUserName {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String email = ip.next();
        String userName = "";
        for(int i = 0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                userName+= email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}
