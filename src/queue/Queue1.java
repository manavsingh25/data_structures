package queue;

/**
 *
 * Queue is a data structure in which we stores the data in a particular manner
 * in queue the element which is inserted first will be popped out first
 * it follows FIFO[ FIRST IN FIRST OUT ] RULE
 * it is used to store certain operations which need to be executed but
 * in a certain manner.........
 *
 */
public class Queue1 {
    int capacity;
    int array[];
    int front = 0;
    int rear = 0;
    Queue1(int capacity){
        this.capacity = capacity;
        //declaring the array...
        array = new int[this.capacity];
    }
    public static void main(String args[]){
        //making a new object named queue of   Queue1
        Queue1 queue = new Queue1(10);

        // When rear become equal to front after some time.
        // This means initially we added few element in queue, then we removed all those element.
        // Then if we will dequeue, it should show error message
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.enqueue(11);
        //printing as well as performing dequeue function on queue at the same time
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        //performing enqueue function using a for loop
        for (int i = 0;i<queue.array.length;i++){
            queue.enqueue(i);
        }
        //performing dequeue function once more
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(10);
    }
    //function to add the element in the queue data structures
    public void enqueue(int elementToAdd){
        if ((this.front+1)%this.array.length ==this.rear){
            System.out.println("Queue is full");
            return ;
        }
        array[front] = elementToAdd;
        //increment the front to add the next element
        front++;
        //setting front as zero as all the elements will be inserted at front
        front = front%this.array.length;
    }
    //function to delete the element from the queue..
    public int dequeue(){
        if (this.rear == this.front){
            this.front = 0;
            this.rear = 0;
            System.out.println("No element in queue.");
            return Integer.MIN_VALUE;
        }
        int element = array[rear];
        rear++;
        //setting rear as zero so that it will always pop the last element
        rear = rear%this.array.length;
        return element;
    }
}
