package top.sbxx.polymorphic;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("黑狗");
        eat(dog);
        Pig pig = new Pig();
        pig.setName("黑猪");
        eat(pig);
    }

    public static void eat(Animal<String> animal) {
        animal.eat();
    }
}
