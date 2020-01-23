package library;

public class QueueImplementation {
    private int capacity = 2;
    private int rear = -1;
    private int front = 0;
    private int currentSize = 0;
    private Users[] queueArr;

    public QueueImplementation() {
        queueArr = new Users[this.capacity];
    }

    public boolean enqueue(Users userName){
        for (int i = 0; i < currentSize; i++) {
            Users u = queueArr[i];
            if (userName.getName().equals(u.getName())){
                return false;
            }
        }
        if (isQueueFull()){
            System.out.println("Capacity is full");
            increaseCapacity();
        }
        rear++;

        if (rear >= queueArr.length && currentSize != queueArr.length){
            rear = 0;
        }
        queueArr[rear] = userName;
        currentSize++;
        return true;
    }

    public boolean dequeue(){
        boolean status = false;
        if(isQueueEmpty()){
            System.out.println("Queue is empty!!!");
        }
        else{
            front++;
            if (front > queueArr.length - 1){
                front = 0;
                status = true;
            }else{
                 status = true;
            }
            currentSize--;
        }
        return status;
    }

    public boolean isQueueFull(){
        boolean state = false;
        if (currentSize == queueArr.length){
            state = true;
        }
        return state;
    }

    public boolean isQueueEmpty(){
        boolean state = false;
        if (currentSize == 0){
            state = true;
        }
        return state;
    }

    public void increaseCapacity(){
        int newCapacity = this.queueArr.length * 2;
        Users[] newArray = new Users[newCapacity];
        int tempFront = front;
        int index = -1;
        while (true){
            newArray[++index] = this.queueArr[tempFront];
            tempFront++;
            if (tempFront == queueArr.length){
                tempFront = 0;
            }
            if (currentSize == index + 1){
                break;
            }
        }
        this.queueArr = newArray;
        System.out.println("The new capacity is " + this.queueArr.length);
        this.front = 0;
        this.rear = index;
    }

    public boolean printQueue(){
        StringBuilder sb = new StringBuilder();
        sb.append('[');

        for (int i = 0; i < queueArr.length; i++) {
            sb.append(queueArr[i]);
            if (i != queueArr.length - 1){
                sb.append(", ");
            }
        }

        sb.append(']');
        System.out.println(sb.toString());
        return true;
    }

    public Users[] getQueueArr() {
        return queueArr;
    }
}
