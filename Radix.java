public class Radix {
  public static int nth(int n, int col) {

  }

  public static int length(int n) {

  }

  public static void merge(MyLinkedList original, MyLinkedList[] buckets) {
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }
  
}
