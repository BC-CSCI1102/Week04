// Broken - Inappropriate use of inheritance!
public class InstrumentedHashSet<E> extends java.util.HashSet<E> {
  // The number of attempted element insertions
  private int addCount;

  public InstrumentedHashSet() {
    this.addCount = 0;
  }
  
  @Override
  public boolean add(E e) {
    this.addCount++;
    return super.add(e);
  }

  @Override
  public boolean addAll(java.util.Collection<? extends E> c) {
    this.addCount += c.size();
    return super.addAll(c);
  }

  public int getAddCount() {
    return this.addCount;
  }

  public static void main(String[] args) {
    InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();
    s.addAll(java.util.Arrays.asList("Snap", "Crackle", "Pop"));

    int n = s.getAddCount();
    System.out.format("count is %d\n", n);
  }
}
