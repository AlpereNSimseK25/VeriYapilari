import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack<String> stack2 = new Stack<String>();

        stack1.push(5);
        stack1.push("merhaba");
        stack1.push("dünya");

        //stack2.push(25); bu işlem yapılamıyor çünkü stack2 nesnesi sadece string değer alabilen bir nesne olarak tanumlandı
        stack2.push("hello");
        stack2.push("merhaba");
        stack2.push("dünya");

        System.out.println(stack1);
        System.out.println(stack2);
    }
}
