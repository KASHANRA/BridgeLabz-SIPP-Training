package level_1;
public class ImplementCustomHashMap {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);
        map.put("apple", 50); 
        System.out.println("apple: " + map.get("apple"));   
        System.out.println("banana: " + map.get("banana")); 
        map.remove("banana");
        System.out.println("banana: " + map.get("banana")); 
    }
}

class CustomHashMap {
    private static class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private final int SIZE = 100;
    private Node[] buckets;
    public CustomHashMap() {
        buckets = new Node[SIZE];
    }

    private int getIndex(String key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(String key, int value) {
        int index = getIndex(key);
        Node head = buckets[index];
        Node current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    public Integer get(String key) {
        int index = getIndex(key);
        Node current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(String key) {
        int index = getIndex(key);
        Node current = buckets[index];
        Node prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}
