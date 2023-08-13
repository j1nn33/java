// принимаем с клавитауры число и возвращаем сумму цифр числа
package task7;
import java.util.*;
public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumDigitsInNumber(332));
        int digit2 = scanner.nextInt();
        System.out.println(sumDigitsInNumber(digit2));
    }
    public static int sumDigitsInNumber(int number){
        // n%10 means modulus of 10. This is used to get last digit.
        // 12345 % 10 means remainder when 12345 is divided by 10, which gives you 5.
        return (number/100 + number /10 %10 +number % 10);

    }
}

