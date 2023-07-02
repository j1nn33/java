package first_kurs.task17;
/* Описание с помощью классов
- владелец животного
     - имеет имя
     - имеет метод выводящий что-то на экран
- живоное
     - имеет вид
     - имеет цвет
*/

public class task17 {
    public static void main(String[] args){
        // объявляем переменную owner_1 класса Owner,
        // с помощью конструкции = new Owner() - создали объект класса Owner
        // подобно String m="Cat"
        Owner owner_1 = new Owner();
        //
        Pet pet_1 = new Pet();
        // присваивание значений
        owner_1.name = "Miki";
        pet_1.kind = "dog";
        pet_1.color = "grey";
        // связываем owner_1 с pet_1
        owner_1.pet = pet_1;
        // вызов функции (метода)
        owner_1.say();
    }
    static class Owner{
        String name;
        // объявляем переменную pet Pet
        Pet pet;
        void say(){
            System.out.println("Hello my name is "+ name + "and my "+ pet.kind + " is color " + pet.color);
        }
    }
    static class Pet{
        String kind;
        String color;

    }
}
