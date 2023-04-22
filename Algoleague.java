public class Algoleague {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong() - 1, k = scanner.nextLong() - 1;
    long end = (k / n) % 2 == 0 ? k % n : n - (k % n), idx = 3 * (end + 1) / 2;
    if (end % 2 == 1)
      System.out.print(Long.toString(idx - 1) + " ");
    System.out.print(idx);
  }
}
