public class Main {
    public static void main(String[] args) {
        MyStack<Fraction> stack = new MyStack<Fraction>();

        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        Fraction f3 = new Fraction(5, 6);

        stack.push(f1);
        stack.push(f2);
        stack.push(f3);

        stack.print();
        System.out.println("Size: " + stack.size());
        System.out.println("Peek: " + stack.getPeek());
        System.out.println("Chua 3/4: " + stack.contains(new Fraction(3, 4)));
        System.out.println("Chua 2/4: " + stack.contains(new Fraction(2, 4)));
        System.out.println("Chua 7/8: " + stack.contains(new Fraction(7, 8)));
        System.out.println("Pop: " + stack.pop());
        stack.print();
        System.out.println("Size: " + stack.size());

        System.out.println();
        MyQueue<Fraction> queue = new MyQueue<Fraction>();

        Fraction q1 = new Fraction(1, 3);
        Fraction q2 = new Fraction(2, 5);
        Fraction q3 = new Fraction(7, 9);

        queue.enQueue(q1);
        queue.enQueue(q2);
        queue.enQueue(q3);

        queue.print();
        System.out.println("Size: " + queue.size());
        System.out.println("Front: " + queue.getFront());
        System.out.println("Chua 2/5: " + queue.contains(new Fraction(2, 5)));
        System.out.println("Chua 1/2: " + queue.contains(new Fraction(1, 2)));
        System.out.println("Dequeue: " + queue.deQueue());
        queue.print();
        System.out.println("Size: " + queue.size());
    }
}
