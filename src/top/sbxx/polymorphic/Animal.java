package top.sbxx.polymorphic;

public class Animal {

    private String name;
    int age = 18;

    // 空参构造
    public Animal() {
    }

    // 有参构造 - 函数重载
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.getName() + "吃饭");
    }
}
