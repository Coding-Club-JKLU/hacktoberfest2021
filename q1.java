import java.util.Scanner; 

  

class Queue { 

    // size tells us about the max capacity of 

    // queue, the actual size of queue will depend on 

    // the positions of front and rear. 

    private int size, front = -1, rear = -1; 

    private int[] arr; 

  

    Queue(int size) { 

        this.size = size; 

        arr = new int[size]; 

    } 

  

    // if rear is at end of array then queue is full 

    // there is no more space left 

    public boolean overflow() { 

        return rear == size - 1; 

    } 

  

    // if the queue is entirely empty then we say it underflows 

    public boolean underflow() { 

        return front == -1 && rear == -1; 

    } 

  

    // to enqueue, we check if there is space to add new element to 

    // queue in case it undeflows then we make front and rear point to 

    // 0th index of array if space is available. 

    void enqueue(int x) { 

        if (overflow()) { 

            System.out.println("The queue is full"); 

            return; 

        } else if (underflow()) { 

            front = 0; 

        } 

  

        // if its not the overflow case then no 

        // matter what so ever we need to increment 

        // rear by 1. 

        rear = rear + 1; 

        arr[rear] = x; 

    } 

  

    // if the queue underflows, then we cannot dequeue anything, 

    // if it does not undeflow then we move the front by 1, thus removing 

    // the number from queue. 

    int dequeue() { 

        if (underflow()) { 

            System.out.println("The queue is already empty"); 

            return -1; 

        } 

  

        // save the element which is to be removed 

        int dequeued = arr[front]; 

  

        // if the front reaches the end, then we reset front and back to 

        // their initial values as there is no more space left. 

        if (front == rear) { 

            front = -1; 

            rear = -1; 

        } 

        // else we will simply move front forward by 1. 

        else { 

            front = front + 1; 

        } 

  

        return dequeued; 

    } 

  

    void traverseQueue() { 

        // we are checking the underflow condition because in case if 

        // the queue is empty, then -1 index won't be accessible as it 

  // will be out of bounds. 

        if (underflow()) { 

            System.out.println("The queue is empty"); 

            return; 

        } 

  

        // traverse the array from front to rear as that's where 

        // our queue lies. 

        for (int i = front; i <= rear; i++) { 

            System.out.print(arr[i] + " "); 

        } 

        System.out.println(); 

    } 

  

    int lengthOfQueue() { 

        int len = 0; 

  

        if (underflow()) { 

            return 0; 

        } 

  

        for (int i = front; i <= rear; i++) { 

            len = len + 1; 

        } 

  

        return len; 

    } 

  

    int peek() { 

        if (underflow()) { 

            System.out.println("Queue is empty"); 

            return -1; 

        } 

  

        return arr[front]; 

    } 

} 

  

public class q1 { 

    public static Queue reverseQueueRecusively(Queue q) { 

        // when the queue becomes empty, then we return that empty 

        // queue, after that the enqueue operation pushes the element 

        // that was dequeued at last so that it is now at first. 

        if (q.underflow()) 

            return q; 

  

        int x = q.dequeue(); 

        // we dequeue an element and call the function for 

        // the remaining queue. 

        q = reverseQueueRecusively(q); 

        // and finally we enqueue the element which was dequeued. 

        q.enqueue(x); 

  

        return q; 

    } 

  

    @SuppressWarnings({ "resource" }) 

    public static void main(String[] args) { 

        Scanner ip = new Scanner(System.in); 

  

        System.out.println("Enter the size of queue:"); 

        int size = ip.nextInt(); 

  

        Queue q = new Queue(size); 

  

        System.out.println("Enter values in queue: "); 

        for (int i = 0; i < size; i++) { 

            int x = ip.nextInt(); 

            q.enqueue(x); 

        } 

  

        System.out.println("Entered queue:"); 

        q.traverseQueue(); 

  

        Queue reversed = reverseQueueRecusively(q); 

  

        System.out.println("Reversed queue:"); 

        reversed.traverseQueue(); 

    } 

} 