import java.util.*;

// Main class
public class Main {
    public static void main(String[] args) {
        // ArrayList
        System.out.println("ArrayList Example:");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        System.out.println("\nLinkedList Example:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");
        System.out.println("LinkedList: " + linkedList);

        // HashMap
        System.out.println("\nHashMap Example:");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("HashMap: " + hashMap);

        // HashSet
        System.out.println("\nHashSet Example:");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        System.out.println("HashSet: " + hashSet);

        // TreeMap
        System.out.println("\nTreeMap Example:");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("TreeMap: " + treeMap);

        // Iterating through ArrayList
        System.out.println("\nIterating through ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // Iterating through LinkedList
        System.out.println("\nIterating through LinkedList:");
        Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }

        // Iterating through HashMap
        System.out.println("\nIterating through HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Iterating through HashSet
        System.out.println("\nIterating through HashSet:");
        for (String item : hashSet) {
            System.out.println(item);
        }

        // Iterating through TreeMap
        System.out.println("\nIterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
