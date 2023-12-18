import java.util.Arrays;
import java.util.Set;

public class Lab07 {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements
        System.out.println("Set1 add 1: " + set1.add(1));
        System.out.println("Set1 add 2: " + set1.add(2));
        System.out.println("Set1 add 3: " + set1.add(3));
        System.out.println("Set1 add 1: " + set1.add(1));
        System.out.println("Set1 add 4: " + set1.add(4));
        System.out.println("Set2 add 4: " + set2.add(4));
        System.out.println("Set2 add 5: " + set2.add(5));
        System.out.println("Set2 add 6: " + set2.add(6));
        System.out.println("Set2 add 7: " + set2.add(7));
        System.out.println("Set1 add 1: " + set1.add(0));

        System.out.println("Size Set1: " + set1.size() + " : "+ Arrays.toString(set1.toArray()));
        System.out.println("Size Set2: " + set2.size() + " : "+ Arrays.toString(set2.toArray()));
        System.out.println();

        // Add all elements
        System.out.println("Add all (set1 ← set1 ∪ set2): " + set1.addAll(set2));
        System.out.println("Size Set1: " + set1.size() + " : "+ Arrays.toString(set1.toArray()));
        System.out.println("Size Set2: " + set2.size() + " : "+ Arrays.toString(set2.toArray()));
        System.out.println();

        // Contains
        System.out.println("Contains 2: " + set1.contains(2));
        System.out.println("Contains 4: " + set1.contains(4));
        System.out.println("Contains 4: " + set1.contains(999));
        System.out.println("Contains All set2 (set1 ⊇ set2): " + set1.containsAll(set2));
        System.out.println();

        // Removing elements
        System.out.println("Remove 2: " + set1.remove(2));
        System.out.println("Remove 4: " + set1.remove(4));
        System.out.println("Remove 999: " + set1.remove(999));
        System.out.println();

        // Contains After removed
        System.out.println("Contains All set2 to set1 after removed (set1 ⊇ set2): " + set1.containsAll(set2));
        System.out.println();
        // Testing contains after removed
        System.out.println("Contains 2: " + set1.contains(2));
        System.out.println("Contains 4: " + set1.contains(4));
        System.out.println("Contains 999: " + set1.contains(999));
        System.out.println();

        // Checking size and elements after removal
        System.out.println("Size of the set after removal: " + set1.size());
        System.out.println("Elements in the set after removal: " + Arrays.toString(set1.toArray()));
        System.out.println();

        System.out.println("RetainAll set1 of set2 (set1 ∩ set2): " + set1.retainAll(set2));
        System.out.println("Size Set1: " + set1.size() + " : "+ Arrays.toString(set1.toArray()));
        System.out.println("Size Set2: " + set2.size() + " : "+ Arrays.toString(set2.toArray()));
        System.out.println();


        // Clearing the set
        set1.clear();
        System.out.println("Size of the set after clearing: " + set1.size());
        System.out.println("Is the set empty? " + set1.isEmpty());
        System.out.println("Size Set1: " + set1.size() + " : "+ Arrays.toString(set1.toArray()));
        System.out.println("Size Set2: " + set2.size() + " : "+ Arrays.toString(set2.toArray()));
        System.out.println();

        // In lecture slide
        Set<String> s = new HashSet<>();
        System.out.println(s.add("hello"));
        System.out.println(s.add("world"));
        System.out.println(s.add("hello"));  // no effect
        System.out.println("Size: " + s.size() + " Elements: " + Arrays.toString(s.toArray()));
        System.out.println(s.remove("hello"));
        System.out.println(s.remove(261200));  // no effect
        System.out.println("Size: " + s.size() + " Elements: " + Arrays.toString(s.toArray()));
        System.out.println(s.contains("world"));  // true
    }
}