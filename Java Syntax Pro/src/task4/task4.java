package task4;

public class task4 {
    //функция выводит max из 4 чисе
    public static int max(int a, int b, int c, int d){
        int maxvalpar1= max(a,b);
        System.out.println( "maxvalpar1 = " + maxvalpar1 );
        int maxvalpar2= max(c,d);
        System.out.println( "maxvalpar2 = " + maxvalpar2 );
        int maxval=max(maxvalpar1,maxvalpar2);
        return maxval;
    }
    //функция выводит max из 2 чисе
    public static int max(int a, int b){
        int maxval;
        if (a > b) {
            //System.out.println( "min = " + a );
            maxval=a;
        }
        else {
            //System.out.println("min = " + b );
            maxval=b;
        }
        return maxval;
    }
    //функция выводит минимум из двух чисе
    public static int min(int a, int b){
        int minval;
        if (a < b) {
            System.out.println( "min = " + a );
            minval=a;
        }
        else {
            System.out.println("min = " + b );
            minval=b;
        }
        return minval;
    }

    // функция перевода веса тела с земного на лунный
    public static double getWeight (int weight) {
        // перевод веса телеа со сменой типа данных
        return (weight*0.165);
    }
    // функция вывоодит
    public static void print3 (String s){
        for(int i = 0; i < 5; i++) {
            System.out.print(s +' ' );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // принимает вес тела в ньютонах на Земле и возвращет
        // сколько это будет в ньютонах на Луне
        System.out.println(getWeight(888));
        print3("dump");
        print3("cargo");
        System.out.println(min(12,33));
        System.out.println(min(-20,0));
        System.out.println(min(-10,-20));

        System.out.println(max(-20,-10));
        System.out.println(max(-40,-10,-30,40));
        System.out.println(max(-20,-40,-30,40));
        System.out.println(max(-20,-10,-40,40));
        System.out.println(max(-20,-10,-30,-40));
    }





}
