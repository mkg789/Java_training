package Strings;

import java.util.Scanner;

public class letterReplacing {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String name = ip.next();
        String res = "";
        for(int i = 0;i<name.length();i++){
            if(name.charAt(i)=='e'){
                res+="i";
            }
            else{
                res+=name.charAt(i);
            }
        }
        System.out.println(res);
    }
}
