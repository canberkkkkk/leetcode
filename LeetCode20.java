public class LeetCode20 {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (Character c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
        continue;
      }

      if (stack.isEmpty())
        return false;

      Character p = stack.pop();
      if ((p == '(' && c == ')') || (p == '{' && c == '}') || (p == '[' && c == ']'))
        continue;

      return false;
    }

    return stack.isEmpty();
  }
}
