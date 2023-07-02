package first_kurs.task16;
// метод print, который выводит на экран строку 4 раза
// строка аргумент ввода
public class task16 {
    public static void main (String[] args){
        // 1st variant вызов функции print_4
        String a="OUTPUT to DISPLAY";
        print_4(a);
        // 2nd variant
        print_4 ("The power is easy to use!");
        // call function say
        say("Mike", "black");
    }
    public static void print_4 (String a){
        for(int i = 0; i < 4; i++) {
            System.out.println(a);
        }
    }
    static void say (String name, String color){
        System.out.println("My name is "+name+"and my cat is "+color);
    }
}
