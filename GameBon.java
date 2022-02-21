import java.util.*;
import java.util.stream.LongStream;

public class GameBon {
    public static void main(String[] args) {
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");


        double sum = 0;
        int min = 1;
        int max = 6;
        int diff = max - min;
        double avgsum = 0;
        Random random = new Random();

        LongStream longStream = LongStream.of();
        OptionalDouble res = longStream.average();

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите кол-во кубиков для броска: ");
        int number = sc.nextInt();

        while(number > 0) {
            int randomint = random.nextInt(diff + 1) + min;
            System.out.println("вам выпало число: " + randomint);
            sum = sum + randomint;
            number = number - 1;
            avgsum = sum / number;
        }
        System.out.println("кубики закончились, сумма чисел: " + sum + "." + " Среднее арифмитическое число: " + avgsum);
    }
}
