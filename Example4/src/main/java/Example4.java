import java.util.Scanner;

public class Example4 {

    public static void main (String[] args) {

        System.out.println("Введиет число: ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        Exchange exchange1 = new Exchange(number, 3, 5);
        WaysGroup allWays1 = exchange1.getAllExchanges();
        System.out.println("Размен для 3 и 5 копеек: ");
        allWays1.print();

        Exchange exchange2 = new Exchange(number, 3, 5, 7);
        WaysGroup allWays2 = exchange2.getAllExchanges();
        System.out.println("Размен для 3, 5 и 7 копеек: ");
        allWays2.print();
    }
}