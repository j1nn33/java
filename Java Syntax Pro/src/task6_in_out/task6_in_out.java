package task6_in_out;
import java.io.*;
import java.util.*;
public class task6_in_out {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String console_string = scanner.nextLine();
        String console_name1 = scanner.nextLine();
        String console_name2 = scanner.nextLine();

        int age = scanner.nextInt();
        int drod = 0;
        int dead_droid = 20;
        int work_droid = scanner.nextInt();
        System.out.println(console_string + "- is a header of the Senate");
        System.out.println(console_name1  + " " + console_name2 + "- is team");
        System.out.println(console_string + " has age " + age);
        System.out.println(" Total droid " + (drod=dead_droid+work_droid));
        for(int i = 0; i < 15; i++) {
            System.out.println(console_string + "- is a header of the Senate");
        }
    scanner.close();
    }
}
