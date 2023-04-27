public class LeetCode155 {
  class MinStack {
    int min = Integer.MAX_VALUE;
    ArrayList<Integer> stack;
    ArrayList<Integer> surpassedMins;

    public MinStack() {
      stack = new ArrayList<>();
      surpassedMins = new ArrayList<>();
    }

    public void push(int val) {
      if (stack.isEmpty())
        min = val;
      else if (val <= min) {
        surpassedMins.add(min);
        min = val;
      }

      stack.add(val);
    }

    public void pop() {
      int el = stack.remove(stack.size() - 1);
      int n = surpassedMins.size();

      if (el == min && n > 0) {
        min = surpassedMins.get(n - 1);
        surpassedMins.remove(n - 1);
      }
    }

    public int top() {
      return stack.get(stack.size() - 1);
    }

    public int getMin() {
      return min;
    }
  }
}
