public class VariableDemo {
    public static void main(String[] args) {
        // 整数型 - 默认int - 定义long要加L（不区分大小写，但是大写更直观）
        byte b = 2; // 1个字节 1B 8bit
        System.out.println(b);

        short s = 10; // 2个字节
        System.out.println(s);

        int i = 20; // 4个字节
        System.out.println(i);

        long l = 10000000000L; // 8个字节
        System.out.println(l);

        // 浮点型 - 默认double - 定义float要加F（不区分大小写，但是大写更直观）
        float f = 10.20F; // 4个字节
        System.out.println(f);

        double d = 10.20; // 8个字节
        System.out.println(d);

        // 字符型
        char c = 'c'; // 2个字节
        System.out.println(c);

        // 布尔型
        boolean bTrue = true; // 1个字节
        System.out.println(bTrue);
    }
}
