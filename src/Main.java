import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class HashSet<E> implements Set<E>{
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Displaying elements
        System.out.println("Elements in the set: " + set);

        // Testing contains
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Testing remove
        System.out.println("Removing 'Banana'");
        set.remove("Banana");
        System.out.println("Elements in the set after removal: " + set);

        // Testing size
        System.out.println("Size of the set: " + set.size());

        // Testing clear
        System.out.println("Clearing the set");
        set.clear();
        System.out.println("Elements in the set after clearing: " + set);

    }
}