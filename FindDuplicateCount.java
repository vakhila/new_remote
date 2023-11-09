public class FindDuplicateCount {

  static int FindDuplicates(int[] a, int n) {

    if (a == null) {
      return 0;
    }
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == n) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(FindDuplicates(new int[] { 1, 2, 2, 3, 4, 5, 6, 7 }, 2));
    System.out.println(FindDuplicates(new int[] { 1, 2, 2, 3, 4, 5, 6, 7 }, 9));
    System.out.println(FindDuplicates(null, 1));
  }
}
