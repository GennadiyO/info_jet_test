import java.util.Scanner;

public class Example3 {

    public static void main(String[] args){
        System.out.println("Введиет слово: ");

        Scanner in = new Scanner(System.in);
        String wp = in.nextLine();

        String pw = new String();
        char[] wpch = wp.toCharArray();
        char[] hcpw = new char[wpch.length];

        int j = wpch.length-1;
        for (int i=0; i<wpch.length; i++){
            hcpw[i] = wpch[j];
            j--;
            pw+=hcpw[i];
        }
        if(wp.equals(pw)){
            System.out.println("Мои поздравления, это слово действительно палиндром!!!");
        } else {
            System.out.println("К сожалению, это слово не являеться палиндромом  :-(");
        }
    }
}
