import java.util.Scanner;

public class Example24 {
    public static void main (String[] args) {

        System.out.println("Введиет число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("Введиет количество номиналов монет: ");
        int ntype = in.nextInt();

        int[] denomCoins = new int[ntype];

        for (int i=0; i<ntype; i++){
            System.out.println("Введиет   "+(i+1)+"-й тип монет: ");
            denomCoins[i]=in.nextInt();
        }

        Exchange exchange1 = new Exchange(number, denomCoins);
        WaysGroup allWays1 = exchange1.getAllExchanges();
        System.out.println("Размен: ");
        allWays1.print();
    }
}
