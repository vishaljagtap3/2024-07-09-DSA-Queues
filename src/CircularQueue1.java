public class CircularQueue1 {
    private int [] arr;
    private int front, rear;
    private int size;
    char lastOp = 'D';

    public CircularQueue1(int size) {
        this.size = size;
        front = rear = -1;
        arr = new int[size];
    }

    public boolean isEmpty() {
        return lastOp == 'D' && front == rear;
    }

    public boolean isFull() {
        return (lastOp == 'I' && front == rear) || (front == -1 && rear == size - 1);
    }

    public boolean insert(int data) {
        if(isFull()) {
            return false;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
        lastOp = 'I';
        return true;
    }

    public int delete() {
        if(isEmpty()) {
            return -999;
        }

        front = (front + 1) % size;
        lastOp = 'D';
        return arr[front];
    }
}
