import java.util.Scanner;

public class Example1 {
    public static void main (String[] args){

        System.out.println("Введиет количество чисел: ");

        Scanner in = new Scanner(System.in);
        int inI = in.nextInt();
        System.out.println("Количество чисел: "+inI);

        float[] numbers = new float[inI];
        float[] numbers2 = new float[inI];
        float inIn;
        for (int i=0; i<inI; i++){
            System.out.println("Введите следующее число в формате 0,00 :");
            inIn = in.nextFloat();
            numbers[i] = inIn;
        }
        float maxElem=0;
        for (float elem: numbers){
            if (elem > maxElem){
                maxElem = elem;
            }
        }
        for (int i=0; i<numbers.length; i++) {
            if (maxElem != numbers[i]) {
                numbers2[i]=numbers[i];
            } else {
                numbers2[i] = 0;
            }
        }
        float maxElem2=0;
        for (float elem: numbers2){
            if (elem > maxElem2){
                maxElem2 = elem;
            }
        }
        System.out.println("Второе по величине число: " + maxElem2);
    }
}