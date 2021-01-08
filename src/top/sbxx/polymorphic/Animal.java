package top.sbxx.polymorphic;

public class Animal<Sting> {

    private Sting name;

    // 空参构造
    public Animal() {
    }

    // 有参构造 - 函数重载
    public Animal(Sting name) {
        this.name = name;
    }

    public Sting getName() {
        return name;
    }

    public void setName(Sting name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.getName() + "吃饭");
    }
}
