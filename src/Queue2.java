import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
    static class Stack {
    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();

    static int curr_size;

    Stack() {
        curr_size = 0;
    }

    static void push(int x) {
        q2.add(x);
        curr_size++;
        while (!q1.isEmpty()) {
            q2.add(q1.peek()); // burada q2 ye q1 in peek i eklenir
            q1.remove();  // burada q2 ye eklenen değer q1 den silinir
        }
        Queue q = q1;
        q1 = q2;
        q2 = q;
    }

    static int pop() {
        if (q1.isEmpty()) {
            return -1;
        } else {
            curr_size--;
            return q1.remove();

        }
    }

    static int top() {
        if (q1.isEmpty()) {
            return -1;
        } else {
            return q1.peek();
        }
    }

    static int size() {
        return curr_size;
    }
}

public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    System.out.println("current size : " + s.size());
    System.out.println(s.top());
    System.out.println("-------------------------------------------");
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println("current size : " + s.size());
    System.out.println(s.top());
}

}
