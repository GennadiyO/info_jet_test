import java.util.Scanner;

public class Example22 {

    public static void main(String[] args){
        System.out.println("Введиет строку: ");

        Scanner in = new Scanner(System.in);
        String inS = in.nextLine();

        String inSc = encode(inS);
        System.out.println("Закдированная строка: "+inSc);
    }

    public static String encode(String source) {
        StringBuffer dest = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            int runLength = 1;
            while (i + 1 < source.length()
                    && source.charAt(i) == source.charAt(i + 1)) {
                runLength++;
                i++;
            }
            dest.append(runLength);
            dest.append(source.charAt(i));
        }
        return dest.toString();
    }
}
