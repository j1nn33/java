package task1;
/*
метод public static void increaseSpeed(int a)
принимает значение скорости n и увеличивает ее на 100 и выводит надпись на экран
*/

public class task1 {
    public static void main(String[] args) {
        //int a=700;
        increaseSpeed(700);

        }
    public static void increaseSpeed(int a){
        System.out.println("You speed is: " + (a+100) +" km/h" );
    }
}
