import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {

        Stack yigin = new Stack();
        yigin.push(10);  // stack ile işlem yaparken .push() ekleme işlemi yapar
        yigin.push(20);

        while (!yigin.isEmpty()) {
            System.out.println(yigin.pop());  // stack ile çalışırken .pop() çıkarma işlemi yapar
        }
    }
}
