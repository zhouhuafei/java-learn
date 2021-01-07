public class ConversionDemo {
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        int c1 = a + b; // 不能直接用byte接收，因为会隐式转换为int，所以要用int接收。
        byte c2 = (byte) (a + b); // 但是可以强行用byte接收，语法格式如左。
        System.out.println(c1);
        System.out.println(c2);

        double d = 3.14;
        int i = (int)d;
        System.out.println(i);
    }
}
