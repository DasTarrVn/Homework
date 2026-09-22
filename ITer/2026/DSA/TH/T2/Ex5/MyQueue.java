public class MyQueue<E> implements QueueInterface<E> {
    private MyStack<E> stack1;
    private MyStack<E> stack2;

    public MyQueue() {
        this.stack1 = new MyStack<E>();
        this.stack2 = new MyStack<E>();
    }

    @Override
    public void enQueue(E item) {
        stack1.push(item);
    }

    @Override
    public E deQueue() {
        if (isEmpty()) {
            return null;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    @Override
    public int size() {
        return stack1.size() + stack2.size();
    }

    @Override
    public boolean contains(E item) {
        return stack1.contains(item) || stack2.contains(item);
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue rong");
            return;
        }
        MyStack<E> temp1 = new MyStack<E>();
        while (!stack1.isEmpty()) {
            temp1.push(stack1.pop());
        }
        System.out.print("Queue: ");
        MyStack<E> temp2 = new MyStack<E>();
        while (!stack2.isEmpty()) {
            E item = stack2.pop();
            System.out.print(item + " ");
            temp2.push(item);
        }
        while (!temp2.isEmpty()) {
            stack2.push(temp2.pop());
        }
        while (!temp1.isEmpty()) {
            E item = temp1.pop();
            System.out.print(item + " ");
            stack1.push(item);
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            return null;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.getPeek();
    }
}
