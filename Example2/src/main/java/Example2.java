import java.util.Scanner;

public class Example2 {

    public static void main(String[] args){
        System.out.println("Введиет число: ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i = 2; i <= number; i++) {         //это не самый лучший способ, но он не требует никаких дополнительных функций
            for (int j = 2; j <= i; j++) {
                if (number % j == 0) {
                    System.out.print(j + " ");
                    number = number / j;
                }

            }
        }
    }
}
