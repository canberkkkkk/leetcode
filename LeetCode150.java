public class LeetCode150 {
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<Integer>();

    for (int i = 0; i < tokens.length; i++) {
      char c = tokens[i].charAt(0);

      if (c != '+' && !(c == '-' && tokens[i].length() == 1) && c != '*' && c != '/') {
        stack.push(Integer.parseInt(tokens[i]));
        continue;
      }

      int a = stack.pop(), b = stack.pop();
      if (c == '+')
        stack.push(b + a);
      else if (c == '-')
        stack.push(b - a);
      else if (c == '*')
        stack.push(b * a);
      else if (c == '/')
        stack.push(b / a);
    }

    return stack.pop();
  }
}
