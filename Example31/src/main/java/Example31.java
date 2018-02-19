import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Example31 {
    public static void main (String[] args) {

        System.out.println("Введиет путь к файлу: ");
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        String funcACK = "ACK";
        String funcF = "F";
        String funcFIB = "FIB";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            String type;
            System.out.println("Введиет навание файла с результатами: ");
            String pathOut = in.nextLine();
            PrintWriter outputFile = new PrintWriter(pathOut, "UTF-8");

            int i =1;
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());

                type = line.replaceAll("\\P{L}+", "");
                if(type.equals(funcACK)){
                    String ackargs = line.replaceAll(funcACK, "").trim();
                    String[] values = ackargs.split(" ");
                    int m = Integer.parseInt(values[0].trim());
                    int n =Integer.parseInt(values[1].trim());
                    int akk = ackermann(m,n);
                    outputFile.print(i+" ");
                    outputFile.println(akk);
                    System.out.println(akk);
                }else if (type.equals(funcF)){
                    String ackargs = line.replaceAll(funcF, "").trim();
                    int num  =Integer.parseInt(ackargs.trim());
                    BigInteger number = BigInteger.valueOf(num);
                    BigInteger result = factorial(number);
                    outputFile.print(i+" ");
                    outputFile.println(result);
                    System.out.println(result);
                }else if (type.equals(funcFIB)){
                    String ackargs = line.replaceAll(funcFIB, "").trim();
                    int n  =Integer.parseInt(ackargs.trim());
                    double result = fibbonaci(n);
                    outputFile.print(i+" ");
                    outputFile.println(result);
                    System.out.println(result);
                }
                line = br.readLine();
                i++;
            }
            outputFile.close();
            String everything = sb.toString();
            System.out.println(everything);
        }catch (IOException ex){
            System.out.println("Файл не найден"+ex);
        }
    }

    public static int ackermann(int m, int n) {
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("Отрицательные аргументы недопустимы.");
        }
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackermann(m-1, 1);
        } else {
            return ackermann(m-1, ackermann(m,n-1));
        }
    }

    public static BigInteger factorial(BigInteger number) {
        BigInteger result = BigInteger.valueOf(1);

        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }

        return result;
    }
    public static double fibbonaci(int n){
        double prev=0d, next=1d, result=0d;
        for (int i = 0; i < n; i++) {
            result=prev+next;
            prev=next;
            next=result;
        }
        return result;
    }
}