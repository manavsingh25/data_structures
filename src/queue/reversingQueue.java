package queue;

/**         pseudo code for queue reversal
 *
 *          first transfer the data from queue to stack
 *          then transfer the data back to the queue...
 *          then we will get our desired result........
 *
 *      queue reverseFunction(queue)
 *      {
 *          if (queue is empty)
 *              return queue;
 *          else {
 *              data = queue.front()
 *              queue.pop()
 *              queue = reverseFunction(queue);
 *              q.push(data);
 *              return queue;
 *              }
 *      }
 *
 */
public class reversingQueue {
    public static void main(String[] args) {

        System.out.println("reversing an queue");

    }
}
