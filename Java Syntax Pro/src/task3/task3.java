package task3;

public class task3 {
    public static void main(String[] args) {
        // Class_TYPE Object = Значение объекта
        // создание 3 объектов типа Jedi
        Jedi jedi_1 = new Jedi();
        jedi_1.name = "Obi-one";
        Jedi jedi_2 = new Jedi();
        jedi_2.name = "Anakin";
        Jedi jedi_3 = new Jedi();
        jedi_3.name = "Joda";
        //5 объектов типа Clone
        Clone clone1 = new Clone();
        Clone clone2 = new Clone();
        Clone clone3 = new Clone();
        Clone clone4 = new Clone();
        Clone clone5 = new Clone();

        //3 перемнных типа Clone имеют заначение null
        Clone clone6;
        Clone clone7;
        Clone clone8;
        //
        Dias dias = new Dias();  //создали объект dias класса Dias
        Class_Clone_1 clone_owner1 = new Class_Clone_1();
        clone_owner1.owner = dias; // присвоили переменной dias = объект dias

    }
    // класс Jedi
    public static class Jedi{
        public String name;
    }
    public static class Clone{
    }
    public static class Dias{
    }
    public static class Class_Clone_1{
        public Dias owner;
    }
}
