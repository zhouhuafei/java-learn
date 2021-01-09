package top.sbxx.polymorphic;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("黑狗");
        eat(dog);
        Pig pig = new Pig();
        pig.setName("黑猪");
        eat(pig);
        // ↑成员方法：编译看左，运行看右。
        // ↓成员变量：编译看左，运行看左。
        Animal animal = new Dog();
        System.out.println(animal.age);
        Dog dog2 = new Dog();
        System.out.println(dog2.age);
    }

    public static void eat(Animal animal) {
        animal.eat();
    }
}
