public class Radix {
  public static int nth(int n, int col) {
    return (int)(n/Math.pow(10, col)) % 10;
  }

  public static int length(int n) {
    if (n == 0) return 1;
    return (int)Math.log10(Math.abs(n)) + 1;
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) {
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }

  public static void radixSortSimple(SortableLinkedList data) {
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for (int i = 0; i < buckets.length; i++) {
      buckets[i] = new SortableLinkedList();
    }
    int numLength = 0;
    boolean yes = true;
    while (yes) {
      yes = false;
      while (data.size() > 0) {
        int currentNum = data.remove(0);
        int digitEnd = nth(currentNum, numLength);
        buckets[digitEnd].add(currentNum);
        if ((yes == false) && (Radix.length(currentNum) > numLength + 1)) {
          yes = true;
        }
      }
      numLength++;
      merge(data, buckets);
    }
  }

  public static void radixSort(SortableLinkedList data) {
    SortableLinkedList[] buckets = new SortableLinkedList[19];
    for (int i = 0; i <= 18; i++) {
      buckets[i] = new SortableLinkedList();
    }
    int numLength = 0;
    boolean yes = true;
    while (yes) {
      yes = false;
      while (data.size() > 0) {
        int currentNum = data.remove(0);
        int digitEnd = nth(currentNum, numLength)+9;
        buckets[digitEnd].add(currentNum);
        if ((yes == false) && (Radix.length(currentNum) > numLength + 1)) {
          yes = true;
        }
      }
      numLength++;
      merge(data, buckets);
    }
  }
}
