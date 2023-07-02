package first_kurs.task4;

public class task4 {
    public static void  main (String[] args) {
        int c=4-3;
        String d=Integer.toString(c);
        //
        type_from (d);
        System.out.println("output c " + c);
        System.out.println("output d " + d);
        System.out.println(Integer.toString(4-3));
        }

        //Определить тип переменной
    public static void type_from (Object value) {
        if (value instanceof Integer) {
            System.out.println("Это Integer");
        } else if (value instanceof String) {
            System.out.println("Это String");
        } else if (value instanceof Float) {
            System.out.println("Это Float");
        } else if (value instanceof Double) {
            System.out.println("Это Double");
        }
    }
}
