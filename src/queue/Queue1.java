package queue;

public class Queue1 {
    int capacity;
    int array[];
    int front = 0;
    int rear = 0;


    Queue1(int capacity){
        this.capacity = capacity;
        array = new int[this.capacity];
    }


    public static void main(String args[]){
        Queue1 queue = new Queue1(10);

        // When rear become equal to front after some time.
        // This means initially we added few element in queue, then we removed all those element.
        // Then if we will dequeue, it should show error message
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.enqueue(11);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        for (int i = 0;i<queue.array.length;i++){
            queue.enqueue(i);
        }
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(10);

    }


    public void enqueue(int elementToAdd){
        if ((this.front+1)%this.array.length ==this.rear){
            System.out.println("Queue is full");
            return ;
        }
        array[front] = elementToAdd;
        front++;
        front = front%this.array.length;
    }

    public int dequeue(){
        if (this.rear == this.front){
            this.front = 0;
            this.rear = 0;
            System.out.println("No element in queue.");
            return Integer.MIN_VALUE;
        }
        int element = array[rear];
        rear++;
        rear = rear%this.array.length;
        return element;
    }
}
