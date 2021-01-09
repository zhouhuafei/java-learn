package top.sbxx.objectDemo;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj1.equals(obj2));
        System.out.println(obj2.equals(obj1));

        System.out.println("--------------------------------------");

        ObjectDemo objDemo1  = new ObjectDemo();
        ObjectDemo objDemo2  = new ObjectDemo();
        System.out.println(objDemo1.hashCode());
        System.out.println(objDemo2.hashCode());
        System.out.println(objDemo1.getClass());
        System.out.println(objDemo2.getClass());
        System.out.println(objDemo1.toString());
        System.out.println(objDemo2.toString());
        System.out.println(objDemo1.equals(objDemo2));
        System.out.println(objDemo2.equals(objDemo1));
    }
}
