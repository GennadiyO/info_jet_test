import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example23 {
    public static void main(String[] args){
        System.out.println("Введиет закодированную строку: ");

        Scanner in = new Scanner(System.in);
        String inS = in.nextLine();

        String inSc = decode(inS);
        System.out.println("Декодированная строка: "+inSc);
    }

    public static String decode(String source) {
        StringBuffer dest = new StringBuffer();
        Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]");
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            matcher.find();
            while (number-- != 0) {
                dest.append(matcher.group());
            }
        }
        return dest.toString();
    }
}