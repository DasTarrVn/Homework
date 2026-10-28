public class Main {
    public static void heapSortDescending(int[] arr) {
        MaxHeap maxHeap = new MaxHeap(arr.length);
        for (int num : arr) {
            maxHeap.insert(num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = maxHeap.extractMax();
        }
    }

    public static void main(String[] args) {
        System.out.println("Ex3 ");
        int[] arr = { 15, 23, 18, 63, 21, 35, 36, 21, 66, 12, 42, 35, 75, 23, 64, 78, 39 };

        heapSortDescending(arr);
        System.out.print("Sap xep giam dan: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        System.out.println("Ex 4 ");
        PersonQueue pq = new PersonQueue(20);
        pq.enqueue(new Person("Alex", 3));
        pq.enqueue(new Person("Bob", 2));
        pq.enqueue(new Person("David", 6));
        pq.enqueue(new Person("Susan", 1));
        System.out.println("Dequeue 1: " + pq.dequeue().name);
        pq.enqueue(new Person("Mike", 5));
        pq.enqueue(new Person("Kevin", 4));
        System.out.println("Dequeue 2: " + pq.dequeue().name);
        System.out.println("Dequeue 3: " + pq.dequeue().name);
        pq.enqueue(new Person("Helen", 0));
        pq.enqueue(new Person("Paul", 8));
        pq.enqueue(new Person("Iris", 7));
        System.out.println("Dequeue 4: " + pq.dequeue().name);
    }
}