import java.util.*;

public class Example21 {
    public static void main (String[] args){

        System.out.println("Введиет количество чисел: ");

        Scanner in = new Scanner(System.in);
        int inI = in.nextInt();
        System.out.println("Количество чисел: "+inI);

        Float[] numbers = new Float[inI];
        float inIn;
        for (int i=0; i<inI; i++){
            System.out.println("Введите следующее число в формате 0,00 :");
            inIn = in.nextFloat();
            numbers[i] = inIn;
        }

        System.out.println("Введиет каке по величине число вы хотите получить: ");
        int inIk = in.nextInt();
        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println(inIk+ "-е по величине число: " + numbers[inIk-1]);
    }
}
