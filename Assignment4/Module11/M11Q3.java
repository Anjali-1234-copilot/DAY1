import java.util.*;

public class M11Q3 {
    // LeetCode 232 – Implement Queue using Stacks
    static class MyQueue {
        Stack<Integer> in = new Stack<>();
        Stack<Integer> out = new Stack<>();

        public MyQueue() {}
        
        public void push(int x) {
            in.push(x);
        }
        
        public int pop() {
            peek();
            return out.pop();
        }
        
        public int peek() {
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }
            return out.peek();
        }
        
        public boolean empty() {
            return in.isEmpty() && out.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.peek()); // 1
        System.out.println(obj.pop());  // 1
        System.out.println(obj.empty());// false
    }
}
