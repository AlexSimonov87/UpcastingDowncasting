package app;

public class Main {

    public static void main(String[] args) {

        Dog dogee = new Dog();

        // или  Animal animal = new Dog();
        Dog dog = new Dog();
        // Upcasting - низходящее преобразование
        Animal animal = dog;   // в переменной Animal лежит объект класса Dog
        // как int помещаяется в long - аналогия
        animal.sleep();

        // Downcasting - низходящее преобразование. От родителя к Потомку - из Animal в Dog
       //  Dog dog2 = animal; - будет ошибка

        // не безопастный способ
        Dog dog2 = (Dog)animal;  // в этой переменной animal лежит объект класса DOG
        dog2.bark();



        Animal animal2 = new Animal();

        // Мы думаем, что в переменной animal2 лежит объект класса Dog. (это не так).
        Dog dog3 = (Dog) animal2;
        // Эти преобразования не меняют ОБЪЕКТ, они меняют ССылку на этот ОБЪЕКТ.

        dog3.bark();

    }
}
