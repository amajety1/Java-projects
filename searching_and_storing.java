import java.util.*;

// Main class
public class Main {
    public static void main(String[] args) {
        // Linear Search Example
        System.out.println("Linear Search Example:");
        int[] linearArray = { 5, 3, 8, 2, 9, 4 };
        int linearSearchKey = 8;
        System.out.println(
                "Index of " + linearSearchKey + " in the array: " + linearSearch(linearArray, linearSearchKey));

        // Binary Search Example
        System.out.println("\nBinary Search Example:");
        int[] sortedArray = { 2, 4, 6, 8, 10, 12, 14 };
        int binarySearchKey = 10;
        System.out.println(
                "Index of " + binarySearchKey + " in the sorted array: " + binarySearch(sortedArray, binarySearchKey));

        // Hashing Example
        System.out.println("\nHashing Example:");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        int hashKey = 2;
        System.out.println("Value associated with key " + hashKey + " in HashMap: " + hashMap.get(hashKey));

        // Tree-based Data Structure (Binary Search Tree) Example
        System.out.println("\nBinary Search Tree Example:");
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(8);
        bst.insert(2);
        bst.insert(4);
        bst.insert(9);
        int bstSearchKey = 4;
        System.out.println("Is " + bstSearchKey + " present in the binary search tree? " + bst.search(bstSearchKey));

        // Storing and Manipulating Data Example
        System.out.println("\nStoring and Manipulating Data Example:");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + arrayList);

        // HashSet Example
        System.out.println("\nHashSet Example:");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        System.out.println("HashSet: " + hashSet);

        // TreeMap Example
        System.out.println("\nTreeMap Example:");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        System.out.println("TreeMap: " + treeMap);
    }

    // Linear Search Method
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search Method (Assumes the array is sorted)
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Binary Search Tree Class
    static class BST {
        // Node class
        static class Node {
            int data;
            Node left, right;

            Node(int data) {
                this.data = data;
                left = right = null;
            }
        }

        // Root of BST
        Node root;

        // Constructor
        BST() {
            root = null;
        }

        // Insertion Method
        void insert(int data) {
            root = insertRec(root, data);
        }

        // Recursive Insertion Method
        Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
            if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }
            return root;
        }

        // Search Method
        boolean search(int key) {
            return searchRec(root, key);
        }

        // Recursive Search Method
        boolean searchRec(Node root, int key) {
            if (root == null || root.data == key) {
                return root != null;
            }
            if (key < root.data) {
                return searchRec(root.left, key);
            }
            return searchRec(root.right, key);
        }
    }
}
