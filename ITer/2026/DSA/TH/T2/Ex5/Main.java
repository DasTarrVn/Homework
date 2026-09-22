public class Main {
    public static void main(String[] args) {
        QueueInterface<Integer> queue = new MyQueue<Integer>();

        System.out.println("Enqueue: 10, 20, 30");
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        queue.print();
        System.out.println("Size: " + queue.size());
        System.out.println("Front: " + queue.getFront());

        System.out.println("Chua 20: " + queue.contains(20));
        System.out.println("Chua 99: " + queue.contains(99));

        System.out.println("Dequeue: " + queue.deQueue());
        queue.print();

        System.out.println("Enqueue: 40, 50");
        queue.enQueue(40);
        queue.enQueue(50);
        queue.print();

        System.out.println("Dequeue het:");
        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.deQueue());
        }

        System.out.println("Queue rong: " + queue.isEmpty());
    }
}
