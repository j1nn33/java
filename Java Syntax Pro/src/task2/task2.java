package task2;
/*
в методе main
создать объект Zam, сохранить ссылку на него в zam
создать объект Dron, сохранить ссылку на него в dron
 */
public class task2 {
    public static void main(String[] args) {
        // создание объектвов Zam, Dron и сохранение ссылок на них в переменные zam, dron
        Zam zam = new Zam();
        Dron dron = new Dron();
        // ссылка на ранее созданный объект Dron
        zam.spy = dron;
        // ссылка на ранее созданный объектZ am
        dron.hunter = zam;

    }
    public static class Zam{
        public int a,b;
        public Dron spy;

    }
    public static class Dron{
        public int a,b;
        public Zam hunter;

    }
}
