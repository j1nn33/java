package first_kurs.task14;

public class task14 {
    public static void main (String[] args){
       int a=5;
       int b;
       // вызов функции квадрата
       b = sqr(a);
       System.out.println(b);
       System.out.println(sqr(5));
    }
    public static int sqr(int a){
        return a*a;
    }
}
