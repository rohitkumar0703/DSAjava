class Queue1{
    // a structure of represent a queue
    static class Queue{
        int front, rear, size;
        int cap;
        int arr[];
    }
    //Function to create a queue of given capacity
    // It initializes size of queue as 0
    Queue creatQueue(int cap){
        Queue queue = new Queue();
        queue.cap = cap;
        queue.front = 0;
        queue.size = 0;

        queue.rear = cap - 1;
        queue.arr = new int[queue.cap];
        return queue;
    }
}