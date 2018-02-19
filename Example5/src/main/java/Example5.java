import java.util.Scanner;

public class Example5 {

    public static void main (String[] args){
        System.out.println("Введиет строку: ");

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println("Введиет искомую подстроку: ");
        String subLine = in.nextLine();
        int pos = line.toLowerCase().indexOf(subLine.toLowerCase());
        if(pos<0){
            System.out.println("К сожалению, в данной строке не найдена искомая подстрока!");
        } else {
            System.out.println("Таки да, в данной строке найдена искомая подстрока!");
            System.out.println("Индекс первого знака искомой подстроки: "+pos);
        }
    }
}
