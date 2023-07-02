package first_kurs.task18;

import java.util.Scanner;
public class task18 {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        // Читаем с клавиатуры строку текста.
        String name = console.nextLine();
        // Читаем с клавиатуры число.
        int age = console.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
