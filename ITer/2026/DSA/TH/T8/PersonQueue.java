public class PersonQueue {
    Person[] heap;
    int heapSize;
    int maxSize;

    public PersonQueue(int capacity) {
        heapSize = 0;
        this.maxSize = capacity;
        heap = new Person[maxSize + 1];
    }

    private int parent(int i) {
        return i / 2;
    }

    private int left(int i) {
        return 2 * i;
    }

    private int right(int i) {
        return (2 * i) + 1;
    }

    private void swap(int i, int j) {
        Person temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void enqueue(Person p) {
        heapSize += 1;
        heap[heapSize] = p;
        int i = heapSize;
        while (i > 1 && heap[parent(i)].priority < heap[i].priority) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    public Person dequeue() {
        Person max = heap[1];
        heap[1] = heap[heapSize];
        heapSize -= 1;

        int i = 1;
        while (i <= heapSize) {
            Person maxPerson = heap[i];
            int max_id = i;

            if (left(i) <= heapSize && maxPerson.priority < heap[left(i)].priority) {
                maxPerson = heap[left(i)];
                max_id = left(i);
            }
            if (right(i) <= heapSize && maxPerson.priority < heap[right(i)].priority) {
                maxPerson = heap[right(i)];
                max_id = right(i);
            }
            if (max_id != i) {
                swap(max_id, i);
                i = max_id;
            } else {
                break;
            }
        }
        return max;
    }
}
