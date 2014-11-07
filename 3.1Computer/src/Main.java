import java.util.Scanner;

/**
 * Created by FF on 2014/11/7.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Which level computer do you want?\n(Top/Mid/Low)");
        Scanner sun =new Scanner(System.in);
        String s=sun.nextLine();
        Factory com=new Factory(s);
        System.out.println("You get "+com.com.level +" Host and Display.");
    }
}
