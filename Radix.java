public class Radix {
  public static int nth(int n, int col) {
    int toDivide = (int)Math.pow(10, col + 1);
    return Math.abs((n % toDivide) / (toDivide / 10));
  }

  public static int length(int n) {
    if (n == 0) return 1;
    if (n < 0) n *= -1;
    return (int)(Math.log10(n) + 1);
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) {
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }

  public static void radixSortSimple(SortableLinkedList data) {

  }

  public static void radixSort(SortableLinkedList data) {
    
  }
}
