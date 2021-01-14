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
    int highestLength = 1;
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for (int i = 0; i < buckets.length; i++) {
      buckets[i] = new SortableLinkedList();
    }
    for (int i = 0; i < highestLength; i++) {
      while (data.size() > 0) {
        if ((i == 0) && (Radix.length(data.get(0)) > highestLength)) {
          highestLength = Radix.length(data.get(0));
        }
        int digitPlace = Radix.nth(data.get(0), i);
        buckets[digitPlace].add(data.get(0));
        data.remove(0);
      }
      Radix.merge(data, buckets);
    }
  }

  public static void radixSort(SortableLinkedList data) {

  }
}
