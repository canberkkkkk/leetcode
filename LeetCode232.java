public class LeetCode232 {
  class MyQueue {
    Stack<Integer> s;

    public MyQueue() {
      s = new Stack<>();
    }

    public void push(int x) {
      Stack<Integer> temp = new Stack<>();

      while (!s.empty())
        temp.push(s.pop());

      temp.push(x);

      while (!temp.empty())
        s.push(temp.pop());
    }

    public int pop() {
      return s.pop();
    }

    public int peek() {
      return s.peek();
    }

    public boolean empty() {
      return s.empty();
    }
  }
}
